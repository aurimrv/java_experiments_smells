package ds.seed5831;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0501");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0502");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        ds.Grafo.Aresta aresta11 = grafo8.proxAdj(10);
        ds.Grafo.Aresta aresta13 = grafo8.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0503");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 35, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        int int15 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0504");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0505");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        int int9 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0506");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0507");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 1, 35);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0508");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        int int9 = grafo6.numVertices();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0509");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 1, (int) 'a');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0510");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, 52);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0511");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        boolean boolean10 = grafo6.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta12 = grafo6.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0512");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0513");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo5.numVertices();
        int int7 = grafo5.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0514");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (-1), (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0515");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0516");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.existeAresta((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0517");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0518");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0519");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo0.retiraAresta((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0520");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0521");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0522");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0523");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0524");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 100, (int) (byte) 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0525");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0526");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        int int11 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0527");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo8.retiraAresta(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0528");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0529");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 1, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0530");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0531");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0532");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        grafo7.imprime();
        int int12 = grafo7.numVertices();
        int int13 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0533");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 35, (int) (short) 1);
        boolean boolean19 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0534");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0535");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo6.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0536");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        int int10 = grafo8.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0537");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0538");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0539");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, (-1));
        int int15 = aresta14.peso();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0540");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0541");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        grafo9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo9.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0542");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0543");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) 10);
        int int14 = grafo0.numVertices();
        int int15 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0544");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        java.lang.Class<?> wildcardClass7 = grafo4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0545");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        int int12 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0546");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 100, 97);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0547");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0548");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0549");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0550");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0551");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0552");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0553");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0554");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(32, (int) ' ');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0555");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0556");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0557");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(1, 35, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (short) -1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0558");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        boolean boolean6 = grafo1.listaAdjVazia(0);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0559");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0560");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo3.primeiroListaAdj((int) ' ');
        int int10 = grafo3.numVertices();
        ds.Grafo.Aresta aresta12 = grafo3.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0561");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 0, 52);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0562");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta(0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0563");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 35, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        grafo0.imprime();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        boolean boolean18 = grafo0.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0564");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo7.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0565");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0566");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta(0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0567");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        grafo0.insereAresta(1, (int) '4', 0);
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        int int18 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0568");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 1, 32);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0569");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0570");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo14.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0571");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        int int4 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0572");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0573");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0574");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0575");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        boolean boolean11 = grafo0.listaAdjVazia(10);
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) 'a');
        grafo0.insereAresta(0, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo0.retiraAresta(97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0576");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) '#', 35);
        ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(aresta15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0577");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 35, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        grafo0.imprime();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass17 = grafo16.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0578");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        boolean boolean7 = grafo0.existeAresta(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo0.existeAresta((int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0579");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 100, 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0580");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0581");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        boolean boolean11 = grafo0.listaAdjVazia(10);
        boolean boolean13 = grafo0.listaAdjVazia(35);
        boolean boolean15 = grafo0.listaAdjVazia(52);
        int int16 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0582");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.retiraAresta((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0583");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        int int8 = grafo0.numVertices();
        grafo0.insereAresta(0, (-1), 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0584");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) (byte) 0, (int) ' ');
        boolean boolean16 = grafo0.existeAresta((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0585");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo5.existeAresta((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0586");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 100, 52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0587");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo0.existeAresta(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0588");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0589");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (-1), (int) (short) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0590");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = aresta11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0591");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.existeAresta((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0592");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(97);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0593");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(52, 1);
        ds.Grafo grafo13 = grafo9.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0594");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0595");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0596");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 10, 1, (int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 10);
        grafo1.insereAresta(52, 97, (int) 'a');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0597");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo9.numVertices();
        grafo9.imprime();
        grafo9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo9.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0598");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo0.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0599");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 1, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0600");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        boolean boolean7 = grafo0.existeAresta(0, (int) (short) 1);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0601");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(35);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean15 = grafo0.existeAresta((int) ' ', (int) '4');
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0602");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) '#', 35);
        grafo0.insereAresta(1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0603");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0604");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo5.imprime();
        boolean boolean8 = grafo5.listaAdjVazia(0);
        boolean boolean11 = grafo5.existeAresta((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0605");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0606");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0607");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0608");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia(0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0609");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0610");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo9.getClass();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0611");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        int int9 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo6.retiraAresta((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0612");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 1, 35);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0613");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0614");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta(35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0615");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0616");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0617");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0618");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0619");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        boolean boolean9 = grafo0.existeAresta((int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo0.retiraAresta(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0620");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (short) 10);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
        grafo0.insereAresta((int) (short) 0, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo16 = grafo0.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0621");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        int int5 = grafo0.numVertices();
        boolean boolean8 = grafo0.existeAresta((int) (byte) 1, (int) (short) 1);
        grafo0.insereAresta(0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0622");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 1, 97);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0623");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        grafo0.insereAresta(1, (int) '4', 0);
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass18 = grafo17.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0624");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0625");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, (-1));
        int int15 = grafo0.numVertices();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0626");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 0, (int) ' ');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0627");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        int int12 = grafo0.numVertices();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0628");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj(10);
        int int8 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo5.retiraAresta(35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0629");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 10, (int) '#');
        grafo1.insereAresta(97, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0630");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) '#');
        boolean boolean17 = grafo13.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0631");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0632");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0633");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0634");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0635");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0636");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0637");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 35, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        int int15 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo0.retiraAresta(52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0638");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        int int9 = grafo0.numVertices();
        int int10 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0639");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        grafo9.insereAresta(0, 10, 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0640");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 35, (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0641");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        ds.Grafo.Aresta aresta18 = grafo14.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta20 = grafo14.proxAdj((int) '#');
        boolean boolean23 = grafo14.existeAresta((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0642");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        java.lang.Class<?> wildcardClass6 = grafo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0643");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (short) 10);
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 1, (int) (short) 0);
        int int15 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo0.retiraAresta(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0644");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(35);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta((int) (byte) 10, (int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta15 = grafo9.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0645");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0646");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 10, (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0647");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0648");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0649");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        boolean boolean16 = grafo13.existeAresta((int) '#', 100);
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0650");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), (int) (byte) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0651");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 1);
        boolean boolean13 = grafo0.existeAresta(10, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) -1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0652");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0653");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0654");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        int int15 = grafo0.numVertices();
        boolean boolean17 = grafo0.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0655");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0656");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo0.retiraAresta((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0657");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 10);
        int int10 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0658");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0659");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0660");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) ' ', (int) (short) 0, 35);
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0661");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0662");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (short) 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0663");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', 52);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0664");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo10.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0665");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, (-1));
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0666");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 52, (int) (byte) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0667");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        int int13 = grafo0.numVertices();
        grafo0.insereAresta((int) (byte) 0, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0668");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) '#');
        grafo9.insereAresta(10, (int) (byte) -1, 97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo9.retiraAresta((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0669");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        grafo7.imprime();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        boolean boolean14 = grafo7.listaAdjVazia((int) 'a');
        boolean boolean16 = grafo7.listaAdjVazia((int) ' ');
        grafo7.insereAresta(0, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0670");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0671");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0672");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0673");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(97, 35);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0674");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo0.retiraAresta(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0675");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        boolean boolean11 = grafo6.existeAresta(0, 1);
        grafo6.insereAresta((int) '4', 52, (int) (byte) -1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0676");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 32, (int) '#');
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0677");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(35);
        int int9 = grafo0.numVertices();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0678");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        boolean boolean10 = grafo8.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0679");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (short) 100, 32);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0680");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 1, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0681");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 1);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo13.insereAresta((int) (short) 100, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0682");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass7 = grafo6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0683");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 0, (int) (short) 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0684");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.insereAresta((int) (short) 10, (int) (short) 1, (int) (short) 0);
        int int8 = grafo0.numVertices();
        boolean boolean11 = grafo0.existeAresta((int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0685");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0686");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 10, (int) (short) -1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0687");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        int int9 = grafo7.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0688");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, 1);
        int int4 = aresta3.v2();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0689");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 35, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0690");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.insereAresta(0, 97, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0691");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0692");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0693");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(97);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0694");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo3.retiraAresta((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0695");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 10, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0696");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 0, (int) '4');
        int int12 = grafo3.numVertices();
        grafo3.insereAresta((int) '#', (int) (short) 0, (int) '#');
        boolean boolean18 = grafo3.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0697");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) ' ');
        boolean boolean13 = grafo8.existeAresta(32, 10);
        int int14 = grafo8.numVertices();
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo8.retiraAresta((int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0698");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj(32);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta(0, 52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0699");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) (byte) 0, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0700");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 1, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0701");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 0, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0702");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        int int5 = grafo0.numVertices();
        boolean boolean8 = grafo0.existeAresta((int) (byte) 1, (int) (short) 1);
        boolean boolean10 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0703");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '4', (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0704");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0705");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0706");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0707");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo8.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0708");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0709");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 1, (int) 'a');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0710");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0711");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 10, 1, (int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0712");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        int int9 = grafo6.numVertices();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(1, (int) 'a');
        boolean boolean15 = grafo10.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0713");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0714");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (short) -1, (int) '4');
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0715");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0716");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) ' ', 0, 1);
        grafo0.imprime();
        int int10 = grafo0.numVertices();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0717");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0718");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 0);
        boolean boolean10 = grafo0.listaAdjVazia(0);
        grafo0.imprime();
        java.lang.Class<?> wildcardClass12 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0719");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo5.insereAresta(100, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0720");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo5.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0721");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0722");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0723");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0724");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) '#', 35);
        ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj(32);
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0725");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
        int int14 = grafo0.numVertices();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0726");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo8.retiraAresta((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0727");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0728");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.retiraAresta(52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0729");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (-1), (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0730");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(1);
        grafo0.insereAresta(97, (int) (byte) -1, (int) (short) 10);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0731");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0732");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 97, 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0733");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo8.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0734");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        boolean boolean15 = grafo0.existeAresta(0, 97);
        boolean boolean18 = grafo0.existeAresta((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0735");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (-1), 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0736");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo0.numVertices();
        grafo0.insereAresta((int) (byte) 0, 100, (-1));
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0737");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0738");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        grafo0.insereAresta(10, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0739");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo8.insereAresta(100, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0740");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo0.existeAresta(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0741");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        grafo8.imprime();
        grafo8.insereAresta(0, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0742");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) 'a', 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0743");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0744");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0745");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean13 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.existeAresta((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0746");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) ' ', 52);
        ds.Grafo.Aresta aresta10 = grafo5.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0747");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) ' ');
        boolean boolean13 = grafo8.existeAresta(32, 10);
        int int14 = grafo8.numVertices();
        grafo8.imprime();
        java.lang.Class<?> wildcardClass16 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0748");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0749");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((int) (short) 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0750");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0751");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (byte) 0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0752");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.insereAresta((int) 'a', (int) (short) 100, 35);
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo17 = grafo10.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0753");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0754");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo0.numVertices();
        boolean boolean11 = grafo0.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0755");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) '#');
        boolean boolean13 = grafo6.existeAresta((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo6.retiraAresta(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0756");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        boolean boolean10 = grafo0.existeAresta(0, 1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo11.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0757");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) '#');
        grafo9.insereAresta(10, (int) (byte) -1, 97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo16 = grafo9.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0758");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
        int int14 = grafo0.numVertices();
        int int15 = grafo0.numVertices();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0759");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        int int9 = aresta8.v2();
        int int10 = aresta8.peso();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0760");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0761");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 0, (int) '4');
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo3.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0762");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0763");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 32, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0764");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0765");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 100, (int) (short) 100);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0766");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (short) 10);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta(97, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0767");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int) '#');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0768");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 35, (int) (byte) 10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0769");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean13 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0770");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0771");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0772");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        ds.Grafo.Aresta aresta9 = grafo6.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0773");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0774");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0775");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        grafo0.imprime();
        boolean boolean11 = grafo0.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0776");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0777");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        int int16 = grafo15.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0778");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 10, (int) (short) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0779");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta(0, 0, 0);
        ds.Grafo.Aresta aresta12 = grafo5.retiraAresta(0, (int) '#');
        ds.Grafo.Aresta aresta14 = grafo5.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0780");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) 0, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0781");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(1, 35, (int) (byte) -1);
        ds.Grafo grafo14 = grafo9.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0782");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 1, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0783");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(0, (int) (byte) 0);
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) 'a');
        java.lang.Class<?> wildcardClass14 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0784");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        boolean boolean10 = grafo6.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta12 = grafo6.proxAdj(97);
        ds.Grafo.Aresta aresta14 = grafo6.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0785");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        grafo0.insereAresta(32, (int) '#', 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0786");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        boolean boolean8 = grafo3.existeAresta((int) (short) 1, (int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 1);
        int int11 = grafo3.numVertices();
        grafo3.insereAresta((int) '4', 52, (int) (short) -1);
        ds.Grafo.Aresta aresta17 = grafo3.primeiroListaAdj((int) '4');
        java.lang.Class<?> wildcardClass18 = aresta17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0787");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 35, (int) (short) 1);
        boolean boolean20 = grafo0.existeAresta(10, (int) ' ');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0788");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0789");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (byte) 1, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0790");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) (byte) 0, (int) ' ');
        boolean boolean16 = grafo0.existeAresta((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0791");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 100, 1);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0792");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 100, 97);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0793");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        int int9 = grafo0.numVertices();
        boolean boolean12 = grafo0.existeAresta(1, (int) '#');
        grafo0.insereAresta((int) (byte) 10, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0794");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0795");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean16 = grafo0.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass17 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0796");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 1, 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0797");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo6.imprime();
        int int9 = grafo6.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0798");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 10, 35);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0799");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0800");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 10, 1, (int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 10);
        int int10 = aresta9.v1();
        int int11 = aresta9.peso();
        int int12 = aresta9.v2();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0801");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo9.numVertices();
        grafo9.imprime();
        boolean boolean14 = grafo9.existeAresta(0, (int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo9.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0802");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) 100, 10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0803");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) ' ');
        boolean boolean13 = grafo8.existeAresta(32, 10);
        grafo8.imprime();
        boolean boolean17 = grafo8.existeAresta((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0804");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) 1, 35);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0805");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0806");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0807");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 10, (int) '#');
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0808");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.existeAresta(35, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0809");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(35, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0810");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 1, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0811");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo5.retiraAresta((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0812");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta((int) '4', (int) (short) 10);
        boolean boolean14 = grafo9.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo9.retiraAresta(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0813");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '#', (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0814");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
        int int14 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0815");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0816");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        boolean boolean8 = grafo3.existeAresta((int) (short) 1, (int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 1);
        int int11 = grafo3.numVertices();
        grafo3.insereAresta((int) '4', 52, (int) (short) -1);
        int int16 = grafo3.numVertices();
        int int17 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0817");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        java.lang.Class<?> wildcardClass10 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0818");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0819");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0820");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0821");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0822");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 0);
        boolean boolean10 = grafo0.listaAdjVazia(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean16 = grafo0.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0823");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) ' ', (int) (short) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0824");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 0, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0825");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 10, 32);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0826");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(52, (int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0827");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0828");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        grafo0.insereAresta((int) '4', (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0829");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 100, (int) (short) 100);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) '#');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0830");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 100, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0831");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0832");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 10, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0833");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0834");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) -1, (int) '4');
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0835");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0836");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) 0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0837");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '#', 35);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0838");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) 'a', 35, (int) (short) -1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        int int15 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 10, (int) ' ', 0);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0839");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.retiraAresta(32, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0840");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 10, (int) '#');
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0841");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0842");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 0, 52);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0843");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        boolean boolean17 = grafo0.existeAresta(97, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo0.existeAresta((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0844");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        ds.Grafo.Aresta aresta12 = grafo7.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0845");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        boolean boolean15 = grafo0.existeAresta(0, 97);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0846");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo9.retiraAresta(52, 1);
        int int13 = grafo9.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0847");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) ' ', (int) (short) 0, 35);
        grafo0.insereAresta((int) (short) 1, (int) 'a', (int) (short) 100);
        ds.Grafo.Aresta aresta22 = grafo0.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0848");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(35);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        int int11 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0849");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo8.existeAresta((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0850");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) ' ', 52);
        ds.Grafo.Aresta aresta10 = grafo5.primeiroListaAdj(1);
        ds.Grafo grafo11 = grafo5.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0851");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        int int15 = grafo0.numVertices();
        grafo0.insereAresta(0, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0852");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0853");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) '#', (int) (short) 100, 97);
        boolean boolean11 = grafo5.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0854");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0855");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        grafo0.insereAresta((int) '4', (int) (short) 10, 1);
        int int12 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0856");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) (byte) 0, (int) ' ');
        boolean boolean16 = grafo0.existeAresta(97, (int) 'a');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0857");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 0, (int) '4');
        int int12 = grafo3.numVertices();
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj(0);
        boolean boolean16 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo17 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0858");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        int int10 = grafo9.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo9.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0859");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 10);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0860");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (short) 10);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(32, 52, 100);
        java.lang.Class<?> wildcardClass14 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0861");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo8 = grafo0.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0862");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0863");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 97, (int) ' ');
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0864");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0865");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0866");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.existeAresta((int) '#', 35);
        ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj(32);
        int int16 = aresta15.peso();
        int int17 = aresta15.v1();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0867");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0868");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 35, (-1));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0869");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 35, (int) (short) 1);
        boolean boolean19 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        int int21 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo0.existeAresta(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0870");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.retiraAresta((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0871");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) ' ', (int) (short) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0872");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 32, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0873");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        grafo0.insereAresta((int) (short) 0, (int) (byte) 10, (int) (byte) 10);
        boolean boolean17 = grafo0.existeAresta(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo0.retiraAresta((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0874");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 32, (int) '4');
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0875");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0876");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.insereAresta((int) (byte) 0, (int) (short) 0, (int) ' ');
        boolean boolean18 = grafo10.existeAresta((int) (byte) 1, 1);
        ds.Grafo.Aresta aresta20 = grafo10.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0877");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        boolean boolean7 = grafo0.existeAresta(0, (int) (short) 1);
        boolean boolean10 = grafo0.existeAresta((int) ' ', (int) (short) -1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta(32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0878");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.insereAresta((int) (byte) 0, (int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo10.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0879");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        boolean boolean10 = grafo0.existeAresta(0, 1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo0.existeAresta((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0880");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        ds.Grafo grafo9 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo6.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0881");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(1);
        grafo0.insereAresta(97, (int) (byte) -1, (int) (short) 10);
        boolean boolean20 = grafo0.existeAresta((int) (short) 1, 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0882");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0883");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 35, (int) (byte) 1);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0884");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean13 = grafo0.existeAresta((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0885");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0886");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.insereAresta(10, (int) (short) -1, (int) (byte) 10);
        int int10 = grafo4.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0887");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia(35);
        boolean boolean14 = grafo0.existeAresta((int) (byte) 10, 52);
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0888");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0889");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (short) 10);
        boolean boolean13 = grafo3.existeAresta((int) ' ', (int) (byte) 1);
        grafo3.imprime();
        ds.Grafo grafo15 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0890");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 35, (int) (byte) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0891");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0892");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0893");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0894");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0895");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(0);
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0896");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0897");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta((int) '4', (int) (short) 10);
        boolean boolean14 = grafo9.listaAdjVazia((int) (byte) 1);
        int int15 = grafo9.numVertices();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0898");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) -1, (int) ' ');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0899");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 52, 35);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0900");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        int int15 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo0.retiraAresta((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0901");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) (byte) 10);
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0902");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        int int9 = grafo0.numVertices();
        int int10 = grafo0.numVertices();
        grafo0.insereAresta((int) 'a', (int) (short) 10, 97);
        boolean boolean17 = grafo0.existeAresta((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 100, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0903");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0904");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) '4');
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0905");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 100, 10);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0906");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean11 = grafo7.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo7.existeAresta((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0907");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0908");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0909");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta(0, 10);
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0910");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo6.retiraAresta((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0911");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0912");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        boolean boolean14 = grafo0.existeAresta((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0913");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) ' ', 52);
        ds.Grafo.Aresta aresta10 = grafo5.primeiroListaAdj(1);
        ds.Grafo grafo11 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0914");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0915");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo5.imprime();
        boolean boolean8 = grafo5.listaAdjVazia(0);
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0916");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta((int) '4', (int) (short) 10);
        boolean boolean14 = grafo9.listaAdjVazia(52);
        ds.Grafo.Aresta aresta16 = grafo9.proxAdj(10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0917");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 10, 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0918");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo0.existeAresta((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0919");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, (int) (byte) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(52);
        java.lang.Class<?> wildcardClass15 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0920");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        boolean boolean11 = grafo0.listaAdjVazia(10);
        boolean boolean13 = grafo0.listaAdjVazia(35);
        boolean boolean15 = grafo0.listaAdjVazia(52);
        grafo0.insereAresta((int) '4', (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0921");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, 100);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0922");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        boolean boolean12 = grafo7.existeAresta(0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0923");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        int int9 = aresta3.peso();
        int int10 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0924");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        int int8 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0925");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0926");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        grafo9.insereAresta((int) (short) 1, 1, (-1));
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0927");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '4', (int) '#');
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0928");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj(32);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        int int10 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0929");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0930");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj(32);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.retiraAresta(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0931");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        ds.Grafo.Aresta aresta8 = grafo4.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0932");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) ' ', (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0933");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        int int9 = grafo0.numVertices();
        int int10 = grafo0.numVertices();
        grafo0.insereAresta((int) 'a', (int) (short) 10, 97);
        boolean boolean17 = grafo0.existeAresta((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo0.retiraAresta(35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0934");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(1);
        boolean boolean15 = grafo0.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0935");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo6.retiraAresta(1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0936");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) '#');
        java.lang.Class<?> wildcardClass16 = grafo13.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0937");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 100, (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0938");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0939");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 0, (int) (byte) -1, (int) (short) 0);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(52);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0940");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        int int9 = grafo6.numVertices();
        boolean boolean11 = grafo6.listaAdjVazia((int) '4');
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        grafo6.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0941");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 1);
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0942");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta13 = grafo0.retiraAresta(32, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0943");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (byte) 10, 100);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0944");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0945");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0946");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        boolean boolean7 = grafo0.existeAresta(0, (int) (short) 1);
        boolean boolean10 = grafo0.existeAresta((int) ' ', (int) (short) -1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.insereAresta(52, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0947");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 100, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0948");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(1);
        grafo0.imprime();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(35);
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0949");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = grafo7.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0950");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 0, (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0951");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) '#');
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0952");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 35, 32);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0953");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj((int) ' ');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0954");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        boolean boolean16 = grafo13.existeAresta((int) '#', 100);
        grafo13.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0955");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 10, (int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo1.existeAresta((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0956");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 100, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0957");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        ds.Grafo.Aresta aresta9 = grafo6.proxAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0958");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0959");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) '4', (-1));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0960");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0961");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 32, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0962");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        int int6 = grafo0.numVertices();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        boolean boolean11 = grafo0.existeAresta(0, (int) 'a');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
        int int14 = grafo0.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo0.existeAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0963");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo6.numVertices();
        boolean boolean10 = grafo6.existeAresta((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0964");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean13 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0965");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (short) 10);
        boolean boolean13 = grafo3.existeAresta((int) ' ', (int) (byte) 1);
        int int14 = grafo3.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0966");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 100, (int) (byte) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0967");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 0, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo13 = grafo0.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0968");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 97, (int) (short) 100);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0969");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0970");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        boolean boolean10 = grafo6.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta12 = grafo6.proxAdj(97);
        ds.Grafo grafo13 = grafo6.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo6.retiraAresta((int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0971");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0972");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo5.imprime();
        boolean boolean8 = grafo5.listaAdjVazia(0);
        int int9 = grafo5.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0973");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 1);
        boolean boolean13 = grafo0.existeAresta(10, 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) 100, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0974");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 100, (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0975");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia(1);
        boolean boolean7 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0976");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 0, 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0977");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
        grafo0.insereAresta((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0978");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 0, (int) '4');
        int int12 = grafo3.numVertices();
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo3.retiraAresta((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0979");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
        grafo6.imprime();
        grafo6.insereAresta((int) '#', 0, (int) '4');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(aresta8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0980");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        int int9 = grafo0.numVertices();
        int int10 = grafo0.numVertices();
        grafo0.insereAresta((int) 'a', (int) (short) 10, 97);
        boolean boolean17 = grafo0.existeAresta((int) '#', 100);
        int int18 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0981");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0982");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo0.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0983");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (byte) 0, 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0984");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) ' ');
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0985");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(52, 32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo8.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0986");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta(35, (int) (byte) 1, (int) 'a');
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 10);
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0987");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0988");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (byte) 0);
        int int9 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0989");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 100, 10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0990");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0991");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0992");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta((int) (short) 10, (int) (byte) -1);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) '#');
        grafo9.insereAresta((int) (short) 1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0993");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo8.existeAresta((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0994");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(35);
        grafo0.insereAresta((int) (short) 0, 0, 32);
        int int10 = grafo0.numVertices();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0995");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo8.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0996");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        boolean boolean10 = grafo0.existeAresta(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0997");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0998");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 35, 32);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0999");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.insereAresta((int) 'a', (int) (short) 100, (int) (short) 100);
        int int9 = grafo1.numVertices();
        int int10 = grafo1.numVertices();
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test1000");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (byte) -1, 35);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, (-1));
        boolean boolean16 = grafo0.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

