package ds.seed9006;

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
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        boolean boolean11 = grafo4.existeAresta(0, (int) '4');
        ds.Grafo grafo12 = grafo4.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo7.primeiroListaAdj((int) ' ');
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        grafo7.insereAresta(32, (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 10, (int) (byte) 100);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        boolean boolean18 = grafo0.existeAresta(1, 100);
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) 'a');
        grafo0.insereAresta(35, 32, 10);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta12 = grafo8.primeiroListaAdj(10);
        grafo8.insereAresta((int) (byte) 1, 32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        boolean boolean17 = grafo8.listaAdjVazia((int) (byte) 10);
        boolean boolean20 = grafo8.existeAresta((int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo8.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj(97);
        boolean boolean17 = grafo12.existeAresta((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        int int10 = grafo4.numVertices();
        ds.Grafo grafo11 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) 'a');
        boolean boolean20 = grafo15.existeAresta((int) 'a', (int) ' ');
        ds.Grafo.Aresta aresta23 = grafo15.retiraAresta((int) (byte) 10, (int) (short) 1);
        int int24 = aresta23.v1();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        boolean boolean14 = grafo0.existeAresta(97, (int) (short) 1);
        int int15 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        boolean boolean12 = grafo7.existeAresta(10, (int) (byte) 0);
        int int13 = grafo7.numVertices();
        grafo7.imprime();
        int int15 = grafo7.numVertices();
        grafo7.insereAresta(0, (int) 'a', 1);
        ds.Grafo.Aresta aresta22 = grafo7.retiraAresta(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        boolean boolean13 = grafo8.listaAdjVazia(10);
        grafo8.imprime();
        int int15 = grafo8.numVertices();
        grafo8.insereAresta(1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        boolean boolean15 = grafo0.listaAdjVazia(0);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo0.retiraAresta((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) '4', 35);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        boolean boolean19 = grafo8.existeAresta(32, (int) '4');
        ds.Grafo grafo20 = grafo8.grafoTransposto();
        ds.Grafo grafo21 = grafo20.grafoTransposto();
        int int22 = grafo20.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo20.insereAresta((int) (byte) -1, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) (short) 0, (int) (byte) 10, (int) (short) 10);
        int int13 = grafo0.numVertices();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        boolean boolean10 = grafo7.listaAdjVazia((int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo0.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        int int11 = grafo10.numVertices();
        int int12 = grafo10.numVertices();
        ds.Grafo.Aresta aresta14 = grafo10.primeiroListaAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo10.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        grafo6.insereAresta(0, (int) (byte) 1, (int) (short) 0);
        grafo6.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        grafo7.imprime();
        boolean boolean13 = grafo7.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta15 = grafo7.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((-1), (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo8.retiraAresta((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        boolean boolean12 = grafo7.existeAresta(10, (int) (byte) 0);
        int int13 = grafo7.numVertices();
        grafo7.imprime();
        grafo7.imprime();
        grafo7.insereAresta(1, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        boolean boolean13 = grafo4.existeAresta(32, (int) (short) 100);
        ds.Grafo grafo14 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo4.retiraAresta(32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        boolean boolean19 = grafo8.existeAresta(32, (int) '4');
        ds.Grafo grafo20 = grafo8.grafoTransposto();
        ds.Grafo grafo21 = grafo20.grafoTransposto();
        ds.Grafo.Aresta aresta23 = grafo20.proxAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, 1, (-1));
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean20 = grafo0.listaAdjVazia(10);
        ds.Grafo grafo21 = grafo0.grafoTransposto();
        boolean boolean24 = grafo21.existeAresta((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '#', (int) (short) 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta(32, (int) 'a');
        int int8 = grafo4.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 0, 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 1, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        boolean boolean18 = grafo0.existeAresta(1, 100);
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) 'a');
        int int21 = grafo0.numVertices();
        boolean boolean23 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta25 = grafo0.proxAdj(35);
        grafo0.insereAresta((int) (short) 10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta31 = grafo0.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) 'a');
        boolean boolean20 = grafo15.existeAresta((int) 'a', (int) ' ');
        ds.Grafo.Aresta aresta23 = grafo15.retiraAresta((int) (byte) 10, (int) (short) 1);
        boolean boolean26 = grafo15.existeAresta(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo15.retiraAresta(32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        int int10 = grafo4.numVertices();
        ds.Grafo grafo11 = grafo4.grafoTransposto();
        ds.Grafo grafo12 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj(1);
        int int15 = grafo12.numVertices();
        boolean boolean18 = grafo12.existeAresta(97, (int) (byte) -1);
        boolean boolean21 = grafo12.existeAresta((int) (short) 10, (int) (short) 0);
        int int22 = grafo12.numVertices();
        ds.Grafo.Aresta aresta24 = grafo12.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta26 = grafo12.primeiroListaAdj(35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta29 = grafo12.retiraAresta(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(aresta24);
        org.junit.Assert.assertNull(aresta26);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        int int16 = grafo8.numVertices();
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        int int13 = grafo8.numVertices();
        boolean boolean15 = grafo8.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 10);
        boolean boolean18 = grafo0.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo12.retiraAresta(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 52, (int) (short) 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        boolean boolean11 = grafo6.existeAresta((int) (byte) 1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo6.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta15 = grafo6.proxAdj(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.primeiroListaAdj(10);
        boolean boolean18 = grafo12.existeAresta((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo4.proxAdj(97);
        int int11 = grafo4.numVertices();
        ds.Grafo.Aresta aresta13 = grafo4.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 10, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo12.grafoTransposto();
        java.lang.Class<?> wildcardClass15 = grafo14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 0, (int) (short) 1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo8.grafoTransposto();
        grafo13.insereAresta((int) (byte) 10, (int) (byte) 0, (int) 'a');
        ds.Grafo.Aresta aresta19 = grafo13.proxAdj(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta19);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        boolean boolean19 = grafo0.existeAresta(10, (int) (byte) 100);
        grafo0.insereAresta((int) (byte) 10, 32, 0);
        ds.Grafo.Aresta aresta25 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) 'a', (int) (byte) 10, (int) (short) -1);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 10, (int) (byte) 0, (int) '4');
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.primeiroListaAdj(97);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        grafo0.insereAresta(10, 0, (int) (byte) 10);
        int int17 = grafo0.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo4.proxAdj(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        grafo8.imprime();
        grafo8.insereAresta(32, (int) (short) 1, 0);
        int int15 = grafo8.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, 1, (-1));
        grafo0.insereAresta((int) '#', (int) '4', (int) (short) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) 'a');
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (short) 10, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo.Aresta aresta10 = grafo7.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo7.retiraAresta(35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 10, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, 1, (-1));
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean20 = grafo0.listaAdjVazia(10);
        ds.Grafo grafo21 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo12.primeiroListaAdj(10);
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        grafo16.insereAresta((int) ' ', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo.Aresta aresta16 = grafo12.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, 1, (-1));
        int int14 = grafo0.numVertices();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean20 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        boolean boolean23 = grafo0.listaAdjVazia(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        grafo7.imprime();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo12.retiraAresta((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 0, (int) (byte) -1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = grafo8.grafoTransposto();
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        ds.Grafo grafo20 = grafo19.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo20.proxAdj(32);
        boolean boolean25 = grafo20.existeAresta(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        int int14 = grafo8.numVertices();
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        boolean boolean17 = grafo8.listaAdjVazia((int) (byte) 10);
        boolean boolean20 = grafo8.existeAresta((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass21 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) '#', (int) (byte) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (-1));
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int) (short) 10, (int) (byte) 0);
        boolean boolean14 = grafo0.listaAdjVazia(32);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta9 = grafo6.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) (short) 0, (int) (byte) 10, (int) (short) 10);
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 0);
        int int15 = aresta14.v1();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) (short) 0, (int) (byte) 10, (int) (short) 10);
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo17 = grafo0.grafoTransposto();
        ds.Grafo grafo18 = grafo17.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo18.existeAresta((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 10, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) ' ', (int) (byte) 1, (-1));
        ds.Grafo.Aresta aresta16 = grafo4.primeiroListaAdj((int) '4');
        boolean boolean18 = grafo4.listaAdjVazia((int) (byte) 1);
        grafo4.imprime();
        ds.Grafo grafo20 = grafo4.grafoTransposto();
        boolean boolean23 = grafo4.existeAresta(0, 10);
        grafo4.insereAresta(1, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
        grafo0.insereAresta((int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj(97);
        ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (short) 1, 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) ' ', (int) (byte) 1, (-1));
        ds.Grafo.Aresta aresta16 = grafo4.proxAdj(97);
        boolean boolean18 = grafo4.listaAdjVazia(0);
        grafo4.imprime();
        grafo4.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.insereAresta(32, 35, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo0.retiraAresta(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        boolean boolean15 = grafo0.listaAdjVazia(0);
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj(35);
        grafo0.insereAresta(0, (int) '4', (int) (short) -1);
        ds.Grafo grafo24 = grafo0.grafoTransposto();
        grafo24.imprime();
        grafo24.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        boolean boolean18 = grafo16.listaAdjVazia(0);
        ds.Grafo grafo19 = grafo16.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo16.primeiroListaAdj((int) (byte) 0);
        int int22 = grafo16.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta(0, (int) '#', (int) (short) 10);
        grafo4.imprime();
        ds.Grafo.Aresta aresta17 = grafo4.primeiroListaAdj((int) (byte) 1);
        ds.Grafo grafo18 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo4.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        grafo12.imprime();
        boolean boolean15 = grafo12.listaAdjVazia((int) ' ');
        boolean boolean17 = grafo12.listaAdjVazia((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 0, (int) (short) 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 1, 35);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        boolean boolean12 = grafo7.existeAresta(10, (int) (byte) 0);
        int int13 = grafo7.numVertices();
        grafo7.imprime();
        int int15 = grafo7.numVertices();
        int int16 = grafo7.numVertices();
        int int17 = grafo7.numVertices();
        ds.Grafo.Aresta aresta19 = grafo7.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        int int6 = grafo4.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo4.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        int int11 = grafo10.numVertices();
        boolean boolean14 = grafo10.existeAresta(10, (int) (byte) 10);
        ds.Grafo.Aresta aresta16 = grafo10.primeiroListaAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        int int10 = grafo4.numVertices();
        ds.Grafo grafo11 = grafo4.grafoTransposto();
        ds.Grafo grafo12 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo12.proxAdj(1);
        int int15 = grafo12.numVertices();
        grafo12.insereAresta(97, (int) ' ', 1);
        int int20 = grafo12.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = grafo8.grafoTransposto();
        grafo17.imprime();
        boolean boolean21 = grafo17.existeAresta((int) ' ', (int) '4');
        int int22 = grafo17.numVertices();
        java.lang.Class<?> wildcardClass23 = grafo17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 10);
        int int15 = aresta14.v2();
        int int16 = aresta14.peso();
        java.lang.Class<?> wildcardClass17 = aresta14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        boolean boolean11 = grafo4.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) ' ', (int) (short) -1);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta9 = grafo4.primeiroListaAdj(0);
        int int10 = grafo4.numVertices();
        int int11 = grafo4.numVertices();
        grafo4.insereAresta((int) '#', (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.insereAresta(32, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean12 = grafo4.existeAresta(0, (int) (byte) 1);
        grafo4.imprime();
        grafo4.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = aresta13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = grafo16.grafoTransposto();
        int int18 = grafo17.numVertices();
        int int19 = grafo17.numVertices();
        grafo17.imprime();
        ds.Grafo.Aresta aresta22 = grafo17.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (byte) 0);
        boolean boolean16 = grafo11.existeAresta((int) ' ', 32);
        grafo11.insereAresta(0, (-1), (int) '4');
        grafo11.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 97, 97);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        int int12 = grafo9.numVertices();
        boolean boolean15 = grafo9.existeAresta((int) (short) 1, (int) (byte) 1);
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 0, 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        grafo0.insereAresta(10, 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj(32);
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
    }
}

