package ds.seed7992;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        int int11 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(35);
        int int10 = grafo1.numVertices();
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) '#', (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        grafo1.insereAresta((int) ' ', 100, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 100, 97);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo13.primeiroListaAdj((int) (short) 0);
        int int19 = aresta18.v2();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        int int5 = grafo2.numVertices();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '#', (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 100, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (-1), (int) ' ');
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        grafo11.insereAresta(35, 0, 0);
        ds.Grafo grafo18 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = aresta20.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) (short) 10, (int) (short) 100);
        boolean boolean18 = grafo12.existeAresta(1, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj((int) '#');
        grafo12.imprime();
        boolean boolean23 = grafo12.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo12.retiraAresta(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        boolean boolean8 = grafo2.existeAresta(0, (int) 'a');
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo2.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        int int12 = grafo10.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo10.retiraAresta((int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 10, (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (byte) -1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) '4', (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta((int) 'a', 100);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) ' ', 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 0, (int) '#');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 1);
        int int5 = grafo1.numVertices();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(0, 0);
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo15.retiraAresta((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Grafo grafo1 = new ds.Grafo(10);
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 100, (int) (short) 10);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.imprime();
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean14 = grafo1.existeAresta(0, (int) (short) 1);
        boolean boolean17 = grafo1.existeAresta(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo13.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo19 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo13.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        int int11 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        int int12 = grafo1.numVertices();
        boolean boolean14 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        grafo2.imprime();
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo2.imprime();
        java.lang.Class<?> wildcardClass8 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        int int12 = grafo1.numVertices();
        boolean boolean15 = grafo1.existeAresta((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        int int15 = aresta14.v2();
        int int16 = aresta14.v2();
        int int17 = aresta14.peso();
        java.lang.Class<?> wildcardClass18 = aresta14.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 1, 97);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 100, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (-1), (int) (short) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.insereAresta(32, 32, (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean11 = grafo8.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (short) 1, (int) (short) 10, 97);
        int int18 = grafo11.numVertices();
        boolean boolean20 = grafo11.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo21 = grafo11.grafoTransposto();
        grafo11.insereAresta(0, (int) (short) 1, (int) (byte) 1);
        boolean boolean28 = grafo11.existeAresta(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, (int) '#');
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        int int5 = grafo2.numVertices();
        int int6 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        int int11 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Grafo grafo1 = new ds.Grafo(10);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        boolean boolean8 = grafo2.existeAresta(0, (int) 'a');
        int int9 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo2.retiraAresta(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta((int) (byte) 1, 10, 97);
        boolean boolean11 = grafo5.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) -1, (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia(1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) 'a', 97);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        grafo2.imprime();
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo2.retiraAresta((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) ' ', (int) (short) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 10);
        boolean boolean6 = grafo1.listaAdjVazia(52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) (short) 10, (int) (short) 100);
        boolean boolean18 = grafo12.existeAresta(1, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo12.primeiroListaAdj((int) '#');
        grafo12.imprime();
        boolean boolean23 = grafo12.listaAdjVazia((int) (short) 1);
        boolean boolean25 = grafo12.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 0, (int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        grafo1.insereAresta(97, (int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        boolean boolean12 = grafo1.existeAresta((int) (byte) 10, 32);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((-1), 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo1.existeAresta((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) '#', (int) (short) 100);
        grafo12.insereAresta(35, (int) (byte) 1, 0);
        grafo12.imprime();
        int int21 = grafo12.numVertices();
        boolean boolean23 = grafo12.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, (-1));
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta((int) (byte) 1, 10, 97);
        grafo5.imprime();
        grafo5.insereAresta((int) (short) 1, 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo5.retiraAresta((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) '#', (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo2.retiraAresta((int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (short) 1, (int) (short) 10, 97);
        int int18 = grafo11.numVertices();
        boolean boolean20 = grafo11.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo21 = grafo11.grafoTransposto();
        grafo11.insereAresta(0, (int) (short) 1, (int) (byte) 1);
        int int26 = grafo11.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 1, (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 0, (int) (short) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(0, 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.imprime();
        ds.Grafo grafo16 = grafo14.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 1, 0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (byte) 10);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.insereAresta(0, 0, (int) ' ');
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) 'a', 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        boolean boolean16 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj(0);
        boolean boolean21 = grafo17.listaAdjVazia(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '#', (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) 100, (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        grafo12.insereAresta(35, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 100, (int) (short) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(0, 0);
        boolean boolean20 = grafo1.listaAdjVazia(1);
        boolean boolean23 = grafo1.existeAresta(35, 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta(32, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) '#', (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        grafo9.insereAresta((int) (short) 10, (int) '#', (int) '#');
        ds.Grafo.Aresta aresta16 = grafo9.retiraAresta((int) (byte) 0, (int) '4');
        boolean boolean18 = grafo9.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta20 = grafo9.proxAdj((int) (short) 10);
        int int21 = aresta20.peso();
        int int22 = aresta20.v1();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(aresta17);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) ' ', (int) (short) 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) 10, 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.Grafo grafo1 = new ds.Grafo(32);
        boolean boolean3 = grafo1.listaAdjVazia(10);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        grafo11.insereAresta(35, 0, 0);
        java.lang.Class<?> wildcardClass18 = grafo11.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.insereAresta(0, 0, (int) ' ');
        grafo1.imprime();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 1);
        int int5 = grafo1.numVertices();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) (short) 0, (int) (short) 10, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo6.retiraAresta(0, 52);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '#', (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int19 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass20 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 10);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(1);
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean13 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        int int4 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) 'a', 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) 'a', 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) 'a', (int) (short) 100);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(97, (int) (short) 0, (int) (short) 100);
        int int17 = grafo1.numVertices();
        boolean boolean19 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia(32);
        grafo10.insereAresta((int) '4', 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta((int) 'a', 100);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo11.retiraAresta((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo.Aresta aresta16 = grafo12.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) ' ');
        ds.Grafo grafo19 = grafo12.grafoTransposto();
        java.lang.Class<?> wildcardClass20 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) ' ');
        grafo1.insereAresta(1, 10, 52);
        int int18 = grafo1.numVertices();
        boolean boolean21 = grafo1.existeAresta(0, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 0, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        boolean boolean16 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(35);
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo1.listaAdjVazia(32);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.insereAresta(35, (int) (short) -1, (int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta21);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
        int int4 = grafo1.numVertices();
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int21 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        boolean boolean18 = grafo1.existeAresta(32, 32);
        grafo1.imprime();
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(0);
        grafo1.insereAresta((int) (short) 1, 100, (int) (short) 0);
        int int26 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 10, 35);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(0, 0);
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo16 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 10, 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 1);
        int int5 = grafo1.numVertices();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.insereAresta((int) (short) 0, (int) (short) 10, (int) (short) -1);
        grafo6.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        boolean boolean18 = grafo12.existeAresta((int) 'a', 32);
        boolean boolean20 = grafo12.listaAdjVazia(52);
        boolean boolean22 = grafo12.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '4', (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
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
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) 'a', 32);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        int int14 = grafo11.numVertices();
        ds.Grafo.Aresta aresta16 = grafo11.primeiroListaAdj((int) (short) 1);
        grafo11.insereAresta(0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (short) -1, (int) '4');
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 97, (int) (short) 100);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(0, (int) '#', 1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) '#', (int) (short) 100);
        grafo12.insereAresta(35, (int) (byte) 1, 0);
        ds.Grafo grafo20 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (short) 1, (int) (short) 10, 97);
        int int18 = grafo11.numVertices();
        boolean boolean20 = grafo11.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo21 = grafo11.grafoTransposto();
        grafo21.insereAresta(97, 97, (int) (short) 1);
        int int26 = grafo21.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 97, (int) (short) 10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        boolean boolean12 = grafo1.existeAresta((int) (byte) 10, 32);
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        grafo1.insereAresta(0, 97, 32);
        boolean boolean16 = grafo1.listaAdjVazia(32);
        java.lang.Class<?> wildcardClass17 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        grafo1.insereAresta((int) (byte) 0, 32, 10);
        int int8 = grafo1.numVertices();
        int int9 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo grafo17 = grafo16.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 10);
        boolean boolean6 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '4', 1);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        int int14 = grafo11.numVertices();
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        int int10 = aresta9.v1();
        int int11 = aresta9.v2();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo9.insereAresta((int) 'a', (int) 'a', (int) (byte) 10);
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 100, 97);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(0, (int) '#', 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(0, 0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo16.retiraAresta(35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 32);
        int int10 = grafo1.numVertices();
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj(10);
        boolean boolean13 = grafo9.listaAdjVazia((int) (byte) 1);
        int int14 = grafo9.numVertices();
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(0, 0);
        grafo1.imprime();
        boolean boolean16 = grafo1.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (-1), (-1));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo10.retiraAresta((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        grafo11.insereAresta(35, 0, 0);
        ds.Grafo grafo18 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo18.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta22 = grafo18.proxAdj(0);
        int int23 = aresta22.v2();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        grafo1.insereAresta((int) (byte) 1, 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj(10);
        boolean boolean13 = grafo9.listaAdjVazia((int) (byte) 1);
        int int14 = grafo9.numVertices();
        grafo9.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 100, (int) 'a');
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = aresta18.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 0, 97);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) (short) 10, (int) '#');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo14.insereAresta((int) (byte) 1, (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo14.retiraAresta(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        int int15 = grafo14.numVertices();
        boolean boolean17 = grafo14.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo14.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        boolean boolean18 = grafo1.existeAresta(32, 32);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(0, (int) (byte) 100);
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj(0);
        int int25 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.Grafo grafo1 = new ds.Grafo(32);
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        int int15 = grafo14.numVertices();
        ds.Grafo.Aresta aresta17 = grafo14.proxAdj(32);
        boolean boolean19 = grafo14.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 32);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        boolean boolean7 = grafo2.listaAdjVazia(0);
        boolean boolean10 = grafo2.existeAresta(10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 10);
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo11.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo1.listaAdjVazia(32);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo15.imprime();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj(10);
        ds.Grafo grafo19 = grafo15.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo15.insereAresta((int) (short) 100, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia(1);
        boolean boolean17 = grafo1.existeAresta((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(0, (int) '#', 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo19 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        grafo2.imprime();
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo6.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia(1);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) '#');
        boolean boolean19 = grafo1.existeAresta((int) (short) 0, 0);
        grafo1.insereAresta((int) (short) 10, (int) 'a', (int) 'a');
        ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo12.insereAresta((int) (short) 100, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) 'a', 97);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 0, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(1);
        boolean boolean7 = grafo1.existeAresta((int) (short) 0, 100);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 0);
        grafo1.insereAresta(97, (int) (byte) 10, (int) (short) -1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta25 = grafo1.retiraAresta(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (byte) 0, (int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo11.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta((int) (byte) 1, 10, 97);
        grafo5.imprime();
        int int11 = grafo5.numVertices();
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Grafo grafo13 = grafo5.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        boolean boolean13 = grafo1.existeAresta(0, 0);
        grafo1.imprime();
        int int15 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo grafo17 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo17.retiraAresta((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '4');
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(0, 0);
        boolean boolean8 = grafo2.existeAresta(0, (int) 'a');
        grafo2.imprime();
        java.lang.Class<?> wildcardClass10 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        boolean boolean18 = grafo12.existeAresta((int) 'a', 32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo12.retiraAresta(97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

