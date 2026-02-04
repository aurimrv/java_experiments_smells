package ds.seed1448;

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
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) (short) 0, 35, (int) (byte) -1);
        boolean boolean14 = grafo0.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(52);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.retiraAresta(97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '#');
        boolean boolean13 = grafo0.existeAresta(52, (int) (byte) 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.insereAresta((int) (short) 10, (int) '4', (-1));
        int int12 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        int int5 = grafo0.numVertices();
        boolean boolean8 = grafo0.existeAresta(0, (int) (byte) -1);
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) (byte) 0, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo0.retiraAresta((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        grafo1.insereAresta(32, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        boolean boolean10 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        boolean boolean13 = grafo0.existeAresta((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 10, (int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 10, (int) (byte) 1);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '#');
        int int11 = grafo0.numVertices();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) '#', (int) 'a');
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.imprime();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta13 = grafo9.primeiroListaAdj((int) (short) 1);
        boolean boolean16 = grafo9.existeAresta((int) (short) 10, 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        int int12 = aresta11.v1();
        int int13 = aresta11.v2();
        int int14 = aresta11.peso();
        int int15 = aresta11.v2();
        int int16 = aresta11.v2();
        int int17 = aresta11.v1();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo8.insereAresta((int) (byte) 10, (int) (byte) 0, 35);
        ds.Grafo.Aresta aresta14 = grafo8.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta(0, 10, 97);
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(32);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) -1, 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 10, (int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        grafo0.insereAresta((int) 'a', 0, (int) ' ');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 0);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        int int14 = grafo13.numVertices();
        grafo13.insereAresta(10, (int) (byte) 100, (int) (byte) 100);
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo13.retiraAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        boolean boolean10 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(97);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo.Aresta aresta10 = grafo7.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.v1();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta(10, (int) (short) 0, 100);
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 10);
        grafo1.insereAresta(52, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo0.existeAresta(0, (int) '#');
        int int14 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        grafo0.imprime();
        boolean boolean11 = grafo0.existeAresta(32, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 10, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.existeAresta((-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) -1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        int int14 = grafo0.numVertices();
        grafo0.insereAresta((int) (byte) 10, (-1), (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 100, (int) '4');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        boolean boolean10 = grafo0.existeAresta((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 10);
        boolean boolean9 = grafo1.existeAresta(35, 97);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        boolean boolean7 = grafo0.existeAresta(0, 0);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 1);
        int int10 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(35, (int) (short) 1);
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (short) -1, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        grafo8.insereAresta((int) (short) 1, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = grafo8.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        int int8 = grafo0.numVertices();
        grafo0.insereAresta(10, 97, (int) (short) 10);
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(10);
        int int15 = aresta14.peso();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) (byte) 1);
        boolean boolean8 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean10 = grafo0.listaAdjVazia(97);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo14 = grafo8.grafoTransposto();
        int int15 = grafo14.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        int int10 = grafo8.numVertices();
        grafo8.insereAresta((int) (byte) 1, 0, 35);
        ds.Grafo.Aresta aresta17 = grafo8.retiraAresta((int) (byte) 1, (int) (short) 10);
        int int18 = grafo8.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) (short) 10, (int) '#');
        grafo5.imprime();
        ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj(52);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) (short) 10, 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, 100);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int9 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean11 = grafo0.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        boolean boolean12 = grafo8.listaAdjVazia(52);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean9 = grafo0.listaAdjVazia(10);
        boolean boolean12 = grafo0.existeAresta(1, 97);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = aresta18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        int int3 = grafo0.numVertices();
        int int4 = grafo0.numVertices();
        boolean boolean6 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) '4', (int) (byte) 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        int int9 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) 'a', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) '4');
        boolean boolean6 = grafo2.listaAdjVazia(0);
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) (byte) 0);
        int int9 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 52, (int) '#');
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        int int5 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 1, (int) (byte) 1, 97);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) '#');
        grafo10.insereAresta(32, (int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj(10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        int int5 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 1, (int) (byte) 1, 97);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) '#');
        boolean boolean14 = grafo10.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta((int) (byte) 0, (int) (byte) 1);
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        int int12 = grafo0.numVertices();
        int int13 = grafo0.numVertices();
        boolean boolean16 = grafo0.existeAresta(10, (int) (byte) -1);
        grafo0.insereAresta(52, (int) '4', (int) (short) 1);
        ds.Grafo.Aresta aresta22 = grafo0.primeiroListaAdj((int) (short) 10);
        grafo0.insereAresta((int) (byte) 1, (int) ' ', (-1));
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean3 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        int int5 = grafo4.numVertices();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        grafo0.insereAresta((int) 'a', 0, (int) ' ');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo10.numVertices();
        int int12 = grafo10.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        grafo0.imprime();
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.retiraAresta((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        boolean boolean8 = grafo0.listaAdjVazia((int) ' ');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta(35, (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (byte) 10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 1, (int) (byte) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo0.retiraAresta(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '#');
        boolean boolean6 = grafo0.existeAresta((int) (byte) 10, 35);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 1, (int) (short) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 0, (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean9 = grafo0.listaAdjVazia(10);
        boolean boolean12 = grafo0.existeAresta(1, 97);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        boolean boolean11 = grafo0.existeAresta((int) (short) 0, 10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) (byte) 1);
        int int14 = grafo0.numVertices();
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo0.existeAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 10);
        grafo1.imprime();
        boolean boolean17 = grafo1.existeAresta((int) (short) 0, 52);
        grafo1.imprime();
        boolean boolean21 = grafo1.existeAresta((int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo14 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj((int) ' ');
        ds.Grafo grafo17 = grafo14.grafoTransposto();
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo14.retiraAresta(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        boolean boolean7 = grafo0.existeAresta(0, 0);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(35);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        int int12 = aresta11.v1();
        int int13 = aresta11.v2();
        int int14 = aresta11.peso();
        int int15 = aresta11.v2();
        int int16 = aresta11.v1();
        int int17 = aresta11.peso();
        int int18 = aresta11.peso();
        int int19 = aresta11.v1();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 0, 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
        grafo0.imprime();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) '#');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 1, 100);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo8.primeiroListaAdj(52);
        int int13 = grafo8.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) '#', (int) (byte) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(1, 97, 35);
        grafo1.imprime();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 10);
        grafo1.imprime();
        boolean boolean17 = grafo1.existeAresta((int) (short) 0, 52);
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 10);
        int int20 = grafo1.numVertices();
        int int21 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', 0, 0);
        int int7 = grafo0.numVertices();
        boolean boolean10 = grafo0.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo0.insereAresta(32, 32, (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(97);
        grafo0.insereAresta((int) '#', (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass12 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) '#', (int) (short) 100);
        boolean boolean9 = grafo1.existeAresta((int) ' ', (int) (short) 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj(10);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) '4', 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo14 = grafo8.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) ' ');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
        int int5 = grafo0.numVertices();
        int int6 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo9.existeAresta((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        boolean boolean13 = grafo0.listaAdjVazia((int) ' ');
        boolean boolean15 = grafo0.listaAdjVazia(0);
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj(10);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (short) 100);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        grafo0.insereAresta((int) 'a', 0, (int) ' ');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.insereAresta((int) (byte) 0, (int) (short) 10, (int) ' ');
        grafo10.insereAresta((int) '#', (int) 'a', 97);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean9 = grafo0.listaAdjVazia(10);
        boolean boolean12 = grafo0.existeAresta(1, 97);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta((int) (byte) 0, 0);
        grafo13.insereAresta(1, (-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean4 = grafo0.listaAdjVazia((int) '4');
        int int5 = grafo0.numVertices();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        boolean boolean13 = grafo0.listaAdjVazia((int) ' ');
        boolean boolean15 = grafo0.listaAdjVazia(0);
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) '#');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) ' ');
        grafo0.insereAresta((int) (short) 1, (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
        int int12 = grafo0.numVertices();
        int int13 = grafo0.numVertices();
        boolean boolean16 = grafo0.existeAresta(10, (int) (byte) -1);
        int int17 = grafo0.numVertices();
        grafo0.insereAresta((int) ' ', 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo0.numVertices();
        boolean boolean5 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        grafo0.insereAresta((int) 'a', 0, (int) ' ');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (short) 0);
        ds.Grafo grafo13 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) (short) 0, 100, 100);
        grafo10.insereAresta(0, 97, (int) (byte) -1);
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }
}

