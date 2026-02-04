package ds.seed5838;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1001");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, 32, (int) (short) 10);
        grafo0.imprime();
        grafo0.imprime();
        int int18 = grafo0.numVertices();
        int int19 = grafo0.numVertices();
        boolean boolean22 = grafo0.existeAresta(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo6.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        grafo0.imprime();
        int int16 = grafo0.numVertices();
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 10, (int) 'a');
        boolean boolean25 = grafo0.existeAresta((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(1, (int) (short) 10, (int) (short) 100);
        ds.Grafo grafo14 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo9.retiraAresta((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        int int14 = grafo13.numVertices();
        grafo13.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, 0);
        boolean boolean15 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo16.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        boolean boolean19 = grafo0.existeAresta((int) ' ', (int) '#');
        ds.Grafo.Aresta aresta21 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta((int) '#', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        int int12 = grafo11.numVertices();
        ds.Grafo.Aresta aresta14 = grafo11.proxAdj(10);
        ds.Grafo.Aresta aresta16 = grafo11.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 10, 52, (int) (byte) 100);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean18 = grafo0.existeAresta(52, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo0.existeAresta((int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(0);
        int int21 = grafo0.numVertices();
        grafo0.insereAresta((int) (byte) 10, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo26 = grafo0.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 10, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        int int6 = grafo0.numVertices();
        boolean boolean9 = grafo0.existeAresta(52, 52);
        boolean boolean12 = grafo0.existeAresta(10, 35);
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, 32, (int) (byte) 100);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = grafo0.existeAresta((int) '4', 100);
        int int11 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta(97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        boolean boolean8 = grafo0.existeAresta(32, (int) (short) -1);
        boolean boolean10 = grafo0.listaAdjVazia(10);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        boolean boolean19 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        int int21 = grafo0.numVertices();
        int int22 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '#');
        int int11 = grafo0.numVertices();
        int int12 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo0.retiraAresta((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) ' ');
        boolean boolean16 = grafo8.existeAresta(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo8.retiraAresta((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        int int10 = aresta3.v1();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 0);
        int int17 = grafo0.numVertices();
        boolean boolean20 = grafo0.existeAresta((int) '#', (int) (byte) -1);
        boolean boolean23 = grafo0.existeAresta((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        grafo0.insereAresta((int) '4', (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 32, (int) (short) 1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 10, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo4.retiraAresta(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        boolean boolean15 = grafo10.listaAdjVazia((int) (short) 1);
        int int16 = grafo10.numVertices();
        grafo10.insereAresta((int) '4', (int) (short) 10, (int) '#');
        int int21 = grafo10.numVertices();
        ds.Grafo grafo22 = grafo10.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo24 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo24.existeAresta((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        boolean boolean19 = grafo0.existeAresta((int) ' ', (int) '#');
        ds.Grafo.Aresta aresta21 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo22 = grafo0.grafoTransposto();
        boolean boolean24 = grafo22.listaAdjVazia(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 100, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 10, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo0.retiraAresta((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean6 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, (int) (short) 10, 100);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.insereAresta((int) '#', 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        grafo0.insereAresta((int) (short) 10, (int) (byte) -1, (int) ' ');
        boolean boolean15 = grafo0.listaAdjVazia((int) (short) 1);
        int int16 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 0, (int) 'a');
        boolean boolean15 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) (short) 0, 10);
        boolean boolean17 = grafo12.listaAdjVazia(52);
        ds.Grafo.Aresta aresta19 = grafo12.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, (int) (short) 10, 100);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        int int15 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo0.existeAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        grafo0.insereAresta((int) (byte) 10, (int) (short) 0, (int) ' ');
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 1, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) ' ', (int) (short) 10, 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia(32);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        grafo10.imprime();
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) ' ', (int) (short) 10, 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo0.existeAresta(97, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 10, 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, 35);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) '#', 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(97);
        int int15 = grafo12.numVertices();
        int int16 = grafo12.numVertices();
        boolean boolean18 = grafo12.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '4', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 0);
        grafo0.imprime();
        int int19 = grafo0.numVertices();
        int int20 = grafo0.numVertices();
        boolean boolean23 = grafo0.existeAresta(52, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo9.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, 0);
        boolean boolean15 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo0.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        grafo0.insereAresta(35, 1, (int) (byte) 1);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '#');
        java.lang.Class<?> wildcardClass14 = aresta13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) ' ', (int) (short) 10, 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo10.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        int int6 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) (short) 10);
        int int11 = grafo0.numVertices();
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(aresta13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean18 = grafo0.listaAdjVazia((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo20 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass21 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean8 = grafo0.existeAresta(32, 32);
        int int9 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, 0);
        boolean boolean15 = grafo0.existeAresta(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo0.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta((int) 'a', (int) ' ', 1);
        boolean boolean15 = grafo9.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta17 = grafo9.proxAdj(1);
        ds.Grafo grafo18 = grafo9.grafoTransposto();
        boolean boolean21 = grafo9.existeAresta((int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '4', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 0);
        grafo0.imprime();
        int int19 = grafo0.numVertices();
        int int20 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo0.retiraAresta(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 0, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(10, 100, (int) (byte) 100);
        grafo9.imprime();
        ds.Grafo.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 10, (int) 'a');
        int int18 = grafo9.numVertices();
        ds.Grafo.Aresta aresta20 = grafo9.primeiroListaAdj((int) (byte) 10);
        boolean boolean22 = grafo9.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo23 = grafo9.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) ' ');
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo0.existeAresta((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo0.retiraAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) -1, 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(35, (int) (byte) 100);
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo10.retiraAresta(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta((int) 'a', (int) ' ', 1);
        boolean boolean15 = grafo9.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta17 = grafo9.proxAdj(1);
        int int18 = grafo9.numVertices();
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(52);
        grafo0.insereAresta((int) '#', (int) '#', 1);
        java.lang.Class<?> wildcardClass16 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        grafo0.imprime();
        boolean boolean20 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo21 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta24 = grafo0.retiraAresta((int) '#', 1);
        int int25 = aresta24.v2();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo0.existeAresta(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        grafo0.insereAresta(52, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '#', (int) (byte) 100);
        grafo0.insereAresta(0, 32, 1);
        ds.Grafo grafo24 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, 52, 0);
        ds.Grafo.Aresta aresta30 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta30);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 10, 97);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        int int15 = grafo0.numVertices();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        grafo0.insereAresta(52, 52, 52);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(10, 100, (int) (byte) 100);
        grafo9.imprime();
        ds.Grafo.Aresta aresta16 = grafo9.primeiroListaAdj((int) (byte) 1);
        ds.Grafo.Aresta aresta18 = grafo9.primeiroListaAdj(52);
        boolean boolean21 = grafo9.existeAresta(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        boolean boolean16 = grafo10.existeAresta((int) (short) 1, (int) (byte) 0);
        boolean boolean19 = grafo10.existeAresta((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, 0);
        boolean boolean15 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        boolean boolean18 = grafo0.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        grafo0.insereAresta((int) (short) 10, (int) (byte) -1, (int) ' ');
        boolean boolean15 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(52);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.insereAresta(0, (int) 'a', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo8.primeiroListaAdj((int) '#');
        int int15 = grafo8.numVertices();
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) 'a');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) '#', (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean11 = grafo0.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        int int13 = grafo12.numVertices();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '4', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj(10);
        boolean boolean21 = grafo0.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo0.retiraAresta((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(aresta24);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        int int12 = grafo11.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo11.insereAresta((int) (byte) 100, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) -1, 35);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        boolean boolean15 = grafo10.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta17 = grafo10.proxAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        int int3 = grafo0.numVertices();
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) (byte) 10);
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        grafo0.imprime();
        int int19 = grafo0.numVertices();
        int int20 = grafo0.numVertices();
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 10);
        grafo9.imprime();
        boolean boolean15 = grafo9.existeAresta(97, 10);
        grafo9.insereAresta(35, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '#', 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.insereAresta((int) (byte) 0, (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo0.retiraAresta(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 0, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 10, (int) '4');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        boolean boolean14 = grafo0.existeAresta(52, (-1));
        grafo0.imprime();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (short) 0);
        int int18 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        boolean boolean15 = grafo10.listaAdjVazia((int) (short) 1);
        int int16 = grafo10.numVertices();
        grafo10.insereAresta((int) '4', (int) (short) 10, (int) '#');
        int int21 = grafo10.numVertices();
        ds.Grafo grafo22 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta24 = grafo10.primeiroListaAdj(35);
        grafo10.imprime();
        java.lang.Class<?> wildcardClass26 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 1, 100);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        boolean boolean12 = grafo9.listaAdjVazia(1);
        boolean boolean15 = grafo9.existeAresta((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 1, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 100, (int) (byte) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', 35);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass4 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 52, (int) (byte) 10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        grafo0.imprime();
        int int16 = grafo0.numVertices();
        int int17 = grafo0.numVertices();
        ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int) ' ');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo0.retiraAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 32, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        boolean boolean12 = grafo9.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo9.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        int int11 = grafo9.numVertices();
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int) '#');
        ds.Grafo.Aresta aresta16 = grafo12.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo10.primeiroListaAdj((int) (short) 1);
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(10);
        int int13 = grafo10.numVertices();
        boolean boolean15 = grafo10.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) -1, (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, 32, (int) (short) 10);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) ' ');
        ds.Grafo.Aresta aresta20 = grafo0.retiraAresta(10, (int) (short) 10);
        ds.Grafo.Aresta aresta22 = grafo0.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        grafo14.insereAresta(32, 0, (int) (byte) 0);
        grafo14.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 10, 52, (int) (byte) 100);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo15.getClass();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, (int) (short) 10, 100);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.insereAresta((int) '#', 0, (int) (byte) 10);
        boolean boolean21 = grafo0.existeAresta((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (byte) 100, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        int int6 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, 32, (int) (short) 10);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean20 = grafo0.existeAresta(0, (int) (byte) -1);
        int int21 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        int int19 = grafo18.numVertices();
        ds.Grafo grafo20 = grafo18.grafoTransposto();
        boolean boolean23 = grafo20.existeAresta(0, 10);
        grafo20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo20.retiraAresta(52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 100, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        boolean boolean14 = grafo0.existeAresta(52, (-1));
        int int15 = grafo0.numVertices();
        int int16 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo0.retiraAresta((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 10);
        boolean boolean11 = grafo0.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        boolean boolean19 = grafo0.existeAresta((int) ' ', (int) '#');
        ds.Grafo grafo20 = grafo0.grafoTransposto();
        grafo20.insereAresta(32, (int) '#', (int) (byte) -1);
        ds.Grafo.Aresta aresta26 = grafo20.proxAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta26);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        int int12 = grafo11.numVertices();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        grafo11.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        grafo0.imprime();
        boolean boolean20 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo21 = grafo0.grafoTransposto();
        ds.Grafo grafo22 = grafo21.grafoTransposto();
        grafo21.imprime();
        int int24 = grafo21.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = grafo0.existeAresta((int) '4', 100);
        boolean boolean13 = grafo0.existeAresta(1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        int int13 = aresta12.v1();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        grafo10.imprime();
        grafo10.insereAresta(1, (int) (short) 0, 0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo10.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 10, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) (short) 0);
        int int13 = grafo10.numVertices();
        grafo10.imprime();
        int int15 = grafo10.numVertices();
        ds.Grafo grafo16 = grafo10.grafoTransposto();
        int int17 = grafo10.numVertices();
        java.lang.Class<?> wildcardClass18 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        grafo0.imprime();
        boolean boolean13 = grafo0.existeAresta(32, 52);
        boolean boolean16 = grafo0.existeAresta((int) (short) 10, 0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(10, 100, (int) (byte) 100);
        grafo9.imprime();
        ds.Grafo.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 10, (int) 'a');
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) (short) 0);
        int int13 = grafo10.numVertices();
        grafo10.imprime();
        int int15 = grafo10.numVertices();
        ds.Grafo grafo16 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean6 = grafo0.existeAresta(1, (int) (byte) 10);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean8 = grafo0.existeAresta(97, 100);
        boolean boolean10 = grafo0.listaAdjVazia(97);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        int int19 = grafo18.numVertices();
        ds.Grafo grafo20 = grafo18.grafoTransposto();
        java.lang.Class<?> wildcardClass21 = grafo18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(32, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(0);
        grafo10.imprime();
        grafo10.insereAresta(1, (int) (short) 10, (int) (short) 100);
        grafo10.insereAresta(1, 10, 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        int int10 = aresta3.v2();
        int int11 = aresta3.v2();
        int int12 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 0, (int) '#');
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) 'a');
        int int14 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        int int10 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 10, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        int int13 = grafo12.numVertices();
        int int14 = grafo12.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 97, (int) (short) 100);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        grafo0.insereAresta(0, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) ' ', (int) (short) 10, 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia(32);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int int14 = grafo13.numVertices();
        int int15 = grafo13.numVertices();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        grafo16.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', 10);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = aresta18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', (int) (short) 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(10, 100, (int) (byte) 100);
        grafo9.imprime();
        ds.Grafo.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass18 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        boolean boolean19 = grafo0.existeAresta((int) ' ', (int) '#');
        ds.Grafo.Aresta aresta21 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo22 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo22.retiraAresta((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo10.getClass();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(0);
        int int21 = grafo0.numVertices();
        grafo0.insereAresta((int) (byte) 10, (-1), (int) (byte) 1);
        grafo0.insereAresta((int) 'a', 52, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean18 = grafo0.listaAdjVazia((int) 'a');
        boolean boolean21 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 1, (int) (short) -1);
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean18 = grafo0.listaAdjVazia(32);
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        int int20 = grafo19.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        boolean boolean14 = grafo0.existeAresta(52, (-1));
        int int15 = grafo0.numVertices();
        boolean boolean17 = grafo0.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo0.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean16 = grafo0.existeAresta((int) (byte) 1, 35);
        int int17 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(1, (int) (short) 10, (int) (short) 100);
        boolean boolean16 = grafo9.existeAresta(0, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(52, (int) (byte) 1);
        grafo0.imprime();
        boolean boolean20 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo21 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta24 = grafo0.retiraAresta((int) '#', 1);
        boolean boolean26 = grafo0.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(1, (int) (short) 10, (int) (short) 100);
        ds.Grafo grafo14 = grafo9.grafoTransposto();
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo11.insereAresta(0, 1, (int) ' ');
        int int16 = grafo11.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 52, (int) (byte) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.imprime();
        grafo12.insereAresta(97, (int) (byte) 1, 1);
        ds.Grafo grafo18 = grafo12.grafoTransposto();
        int int19 = grafo18.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 32, (-1));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        boolean boolean15 = grafo10.listaAdjVazia((int) (short) 1);
        int int16 = grafo10.numVertices();
        grafo10.insereAresta((int) '4', (int) (short) 10, (int) '#');
        int int21 = grafo10.numVertices();
        ds.Grafo grafo22 = grafo10.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo24 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) (short) 0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean6 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, (int) (byte) 100);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        int int6 = grafo0.numVertices();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = aresta9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', (int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo10.primeiroListaAdj((int) (short) 1);
        boolean boolean17 = grafo10.listaAdjVazia(0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) '#', (int) (byte) 10);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        int int13 = grafo0.numVertices();
        boolean boolean15 = grafo0.listaAdjVazia((int) ' ');
        grafo0.imprime();
        java.lang.Class<?> wildcardClass17 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, 32, (int) (short) 10);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '4', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean18 = grafo0.listaAdjVazia((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo20 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 1, (int) (short) -1);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, 10, 97);
        ds.Grafo grafo20 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo0.existeAresta((int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        int int12 = grafo0.numVertices();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        boolean boolean18 = grafo13.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta21 = grafo13.retiraAresta(32, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) 'a', 35);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(52);
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean20 = grafo0.listaAdjVazia(97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean6 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo10.proxAdj(1);
        int int15 = grafo10.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 10, 35);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (-1), (int) (byte) 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1227");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean16 = grafo0.existeAresta((int) (byte) 1, 35);
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        grafo19.insereAresta(52, (int) 'a', (int) (short) 10);
        int int24 = grafo19.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo19.existeAresta((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1228");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1229");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        grafo0.imprime();
        int int16 = grafo0.numVertices();
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        boolean boolean19 = grafo17.listaAdjVazia(0);
        ds.Grafo grafo20 = grafo17.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1230");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(32);
        grafo0.imprime();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) (short) 10);
        grafo0.imprime();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1231");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, 35, 97);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1232");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) ' ', 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1233");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(52, (int) '#', 10);
        ds.Grafo grafo14 = grafo9.grafoTransposto();
        int int15 = grafo9.numVertices();
        java.lang.Class<?> wildcardClass16 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1234");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        boolean boolean16 = grafo0.existeAresta(32, (int) '#');
        grafo0.imprime();
        boolean boolean20 = grafo0.existeAresta((int) ' ', 97);
        int int21 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo0.retiraAresta((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1235");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean20 = grafo0.listaAdjVazia(97);
        boolean boolean23 = grafo0.existeAresta((int) (short) 10, (-1));
        ds.Grafo grafo24 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1236");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1237");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean8 = grafo0.existeAresta(97, 100);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1238");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) ' ', (int) (short) 10, 0);
        int int10 = grafo0.numVertices();
        boolean boolean12 = grafo0.listaAdjVazia((int) '4');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean16 = grafo13.listaAdjVazia(10);
        grafo13.imprime();
        grafo13.insereAresta(97, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1239");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean8 = grafo0.existeAresta(97, 100);
        boolean boolean10 = grafo0.listaAdjVazia(97);
        boolean boolean12 = grafo0.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1240");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1241");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int15 = grafo0.numVertices();
        boolean boolean17 = grafo0.listaAdjVazia((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1242");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        int int19 = grafo18.numVertices();
        ds.Grafo grafo20 = grafo18.grafoTransposto();
        grafo20.imprime();
        java.lang.Class<?> wildcardClass22 = grafo20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1243");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1244");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        int int12 = grafo0.numVertices();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        int int14 = grafo13.numVertices();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        grafo13.insereAresta(35, 10, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1245");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, 32, (int) (short) 10);
        boolean boolean17 = grafo0.listaAdjVazia((int) '4');
        boolean boolean20 = grafo0.existeAresta((int) ' ', 100);
        grafo0.insereAresta((int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1246");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1248");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        int int9 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo.Aresta aresta13 = grafo0.retiraAresta(35, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1249");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta14 = grafo10.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1250");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, (int) '4');
    }
}

