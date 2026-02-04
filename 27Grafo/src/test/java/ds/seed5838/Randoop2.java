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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, (int) (short) -1, 35);
        int int16 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo1.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean8 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 10);
        boolean boolean13 = grafo1.existeAresta((int) 'a', 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        boolean boolean8 = grafo1.existeAresta((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 0, (int) '4');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj(0);
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        boolean boolean19 = grafo13.existeAresta(0, 1);
        boolean boolean22 = grafo13.existeAresta(10, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) '#', (int) (byte) 100);
        grafo7.imprime();
        grafo7.insereAresta(35, (int) ' ', 32);
        int int16 = grafo7.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        grafo1.insereAresta(35, 100, 0);
        boolean boolean15 = grafo1.listaAdjVazia(0);
        int int16 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo1.retiraAresta(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) '#', 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, 1, (int) (short) 100);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo1.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta(35, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 0, (int) (short) 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 1, (int) (short) 0, 35);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia(35);
        grafo7.insereAresta(35, 32, (int) '#');
        boolean boolean15 = grafo7.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo16 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo16.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) (byte) 0);
        grafo9.insereAresta(0, 100, (int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 10, (int) (byte) 1);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.imprime();
        int int7 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        int int11 = grafo1.numVertices();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        int int7 = grafo1.numVertices();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia(35);
        grafo7.imprime();
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(0);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo15.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 100, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        int int10 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) '#', 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean16 = grafo1.existeAresta((int) (short) 0, 52);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '#');
        boolean boolean11 = grafo1.listaAdjVazia((int) ' ');
        grafo1.imprime();
        boolean boolean15 = grafo1.existeAresta((int) '#', (int) (short) -1);
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        grafo1.insereAresta(10, (int) (short) -1, (int) '4');
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(52);
        boolean boolean11 = grafo1.existeAresta(35, (int) (short) 0);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 1);
        int int4 = grafo1.numVertices();
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(35);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = aresta9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (short) 1);
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass21 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo grafo1 = new ds.Grafo(32);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean6 = grafo1.existeAresta(1, (int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(32);
        boolean boolean18 = grafo1.existeAresta(0, 97);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo14.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo12.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(0, 35);
        int int21 = aresta20.v2();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo1 = new ds.Grafo(97);
        int int2 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 10, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(0, (int) (byte) 100);
        boolean boolean23 = grafo1.listaAdjVazia(0);
        boolean boolean26 = grafo1.existeAresta((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass27 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(0);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo16.insereAresta((int) '4', (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, 100);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        int int12 = grafo1.numVertices();
        boolean boolean14 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(0);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo12.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 32, 100);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, 52);
        boolean boolean11 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 100);
        grafo1.imprime();
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        boolean boolean17 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta(0, 35);
        grafo1.insereAresta((int) (byte) 10, 100, 0);
        boolean boolean26 = grafo1.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo13.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.imprime();
        boolean boolean10 = grafo7.listaAdjVazia(0);
        int int11 = grafo7.numVertices();
        boolean boolean14 = grafo7.existeAresta(35, 10);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo15.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (byte) 0, 0);
        int int4 = aresta3.v1();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 35, (int) ' ');
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean11 = grafo8.listaAdjVazia(0);
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo13.retiraAresta(35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 10, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo6.numVertices();
        grafo6.imprime();
        int int9 = grafo6.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) ' ', 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(97);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        boolean boolean7 = grafo1.listaAdjVazia(32);
        boolean boolean9 = grafo1.listaAdjVazia(0);
        grafo1.insereAresta(32, 52, 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo15.insereAresta((int) (short) 1, 97, (int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo9.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo6.insereAresta(0, (int) 'a', (int) ' ');
        int int11 = grafo6.numVertices();
        ds.Grafo.Aresta aresta13 = grafo6.primeiroListaAdj((int) (byte) 1);
        grafo6.insereAresta((int) (byte) 10, 52, (int) (byte) 100);
        int int18 = grafo6.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        int int10 = grafo9.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) '#');
        int int18 = grafo15.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.insereAresta(35, 32, (int) (short) -1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, (int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(0, (int) (byte) 100);
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        boolean boolean24 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo25 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(grafo25);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 35, (int) (short) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj(35);
        ds.Grafo.Aresta aresta13 = grafo9.proxAdj(0);
        grafo9.insereAresta((int) (short) 10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta(52, (int) (short) 10);
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo1 = new ds.Grafo(52);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) 'a', 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj(0);
        int int16 = grafo13.numVertices();
        boolean boolean19 = grafo13.existeAresta(0, 100);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.insereAresta((int) '#', (int) (byte) 1, (int) (byte) 10);
        int int12 = grafo7.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        boolean boolean5 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, 0, (int) 'a');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj(0);
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo13.retiraAresta(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, 35, 35);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '4', 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.imprime();
        boolean boolean21 = grafo1.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) '#', (int) (byte) 100);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        boolean boolean15 = grafo7.listaAdjVazia(10);
        int int16 = grafo7.numVertices();
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        java.lang.Class<?> wildcardClass8 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean11 = grafo8.listaAdjVazia(0);
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        java.lang.Class<?> wildcardClass14 = grafo12.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, 32, (int) (byte) 100);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 1, (int) (short) 10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.existeAresta(0, (int) (short) 0);
        grafo1.insereAresta(0, 52, (int) (short) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
        int int9 = grafo1.numVertices();
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo18.insereAresta(32, 35, (int) (byte) 10);
        ds.Grafo.Aresta aresta24 = grafo18.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta24);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo6.insereAresta(0, (int) 'a', (int) ' ');
        int int11 = grafo6.numVertices();
        ds.Grafo.Aresta aresta13 = grafo6.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo6.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 1, (int) ' ', 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        grafo1.insereAresta(10, (int) (short) 100, (int) (short) 100);
        grafo1.insereAresta((int) (short) 1, 1, (int) (short) 10);
        grafo1.insereAresta((int) (short) 10, (int) (short) 1, 0);
        ds.Grafo.Aresta aresta24 = grafo1.retiraAresta((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta24);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) (byte) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        grafo1.imprime();
        boolean boolean6 = grafo1.listaAdjVazia((int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        grafo1.insereAresta(1, (int) '#', (-1));
        grafo1.insereAresta((int) (byte) 0, (int) '#', (int) (byte) 100);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        int int16 = grafo1.numVertices();
        boolean boolean18 = grafo1.listaAdjVazia(10);
        java.lang.Class<?> wildcardClass19 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) '#', (int) (byte) 100);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        boolean boolean15 = grafo11.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo11.retiraAresta((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (byte) 1);
        int int4 = grafo1.numVertices();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass6 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        int int10 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.imprime();
        boolean boolean10 = grafo7.listaAdjVazia(0);
        int int11 = grafo7.numVertices();
        boolean boolean14 = grafo7.existeAresta(35, 10);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        grafo15.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(32);
        grafo1.imprime();
        boolean boolean10 = grafo1.existeAresta((int) '4', 97);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (-1), 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo12.existeAresta((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo1.numVertices();
        grafo1.insereAresta((int) (byte) 0, (int) (byte) 10, (-1));
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean10 = grafo1.existeAresta((int) (short) 10, 97);
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo12);
    }
}

