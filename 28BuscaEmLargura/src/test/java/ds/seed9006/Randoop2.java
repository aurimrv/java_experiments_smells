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
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (-1));
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo7.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) (short) 10);
        grafo14.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo14.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta((int) (short) 1, (-1));
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(10);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean14 = grafo1.existeAresta((int) (byte) 10, 97);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.insereAresta(0, (int) '#', (int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        boolean boolean21 = grafo1.existeAresta((int) '#', (int) (byte) -1);
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) '4');
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass25 = grafo24.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo1 = new ds.Grafo(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 32, (int) 'a');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (short) -1, 32);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 10, 1, 97);
        boolean boolean8 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int14 = aresta13.peso();
        int int15 = aresta13.v1();
        int int16 = aresta13.peso();
        java.lang.Class<?> wildcardClass17 = aresta13.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        int int10 = aresta3.peso();
        int int11 = aresta3.v1();
        int int12 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        boolean boolean5 = grafo2.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean10 = grafo1.listaAdjVazia((int) ' ');
        int int11 = grafo1.numVertices();
        int int12 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(aresta14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        int int9 = grafo8.numVertices();
        int int10 = grafo8.numVertices();
        boolean boolean12 = grafo8.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo8.insereAresta((int) (short) -1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) -1, 0);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo2.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 0, (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, 97);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(32);
        grafo1.insereAresta(52, (int) (byte) 1, (int) (short) -1);
        ds.Grafo.Aresta aresta25 = grafo1.proxAdj(1);
        boolean boolean27 = grafo1.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) 100, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        int int6 = grafo2.numVertices();
        ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj(52);
        int int9 = grafo2.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean11 = grafo7.listaAdjVazia((int) (byte) 1);
        grafo7.imprime();
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 10, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo6.imprime();
        int int8 = grafo6.numVertices();
        boolean boolean11 = grafo6.existeAresta(32, 0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        int int6 = grafo2.numVertices();
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        grafo15.insereAresta((int) (short) 1, (int) (byte) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo15.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) ' ', (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta(0, (int) (short) -1, (int) (short) 100);
        grafo1.imprime();
        int int12 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) -1, (int) '#');
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 0, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.insereAresta(1, 35, (int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 0, (int) '#');
        boolean boolean24 = grafo1.existeAresta((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.imprime();
        grafo1.insereAresta((int) '4', 32, 52);
        int int9 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 10, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        int int12 = grafo1.numVertices();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        int int4 = grafo2.numVertices();
        ds.Grafo.Aresta aresta6 = grafo2.proxAdj((int) (short) 1);
        grafo2.insereAresta((int) (byte) 1, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 0, (int) '4');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '#');
        boolean boolean18 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.insereAresta(0, 52, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.existeAresta((int) (short) 0, (int) '#');
        grafo1.insereAresta((int) (short) 0, 97, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo22 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 97);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) ' ', 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo5.insereAresta((int) (short) 10, (int) (byte) 100, (int) (byte) -1);
        boolean boolean11 = grafo5.listaAdjVazia(1);
        boolean boolean14 = grafo5.existeAresta((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.imprime();
        boolean boolean7 = grafo1.existeAresta(10, 10);
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        grafo1.insereAresta((int) '#', 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo13.proxAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo13.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.existeAresta((int) (short) 0, (int) '#');
        grafo1.imprime();
        grafo1.insereAresta(32, 52, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) '4', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo8 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 0, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 100, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        int int8 = grafo1.numVertices();
        int int9 = grafo1.numVertices();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (short) 0, (int) (byte) -1);
        grafo1.insereAresta((int) '4', (int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta(35, 0, (int) 'a');
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        boolean boolean8 = grafo1.listaAdjVazia(52);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, 97);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(32);
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int) (short) 10);
        int int24 = grafo1.numVertices();
        ds.Grafo.Aresta aresta26 = grafo1.proxAdj(1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNull(aresta26);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean4 = grafo1.existeAresta(35, 10);
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        int int12 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.insereAresta(0, (int) (short) -1, (int) '4');
        boolean boolean13 = grafo7.listaAdjVazia((int) ' ');
        boolean boolean16 = grafo7.existeAresta((int) (short) 1, 32);
        int int17 = grafo7.numVertices();
        ds.Grafo.Aresta aresta19 = grafo7.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        int int6 = grafo2.numVertices();
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) '4');
        grafo2.imprime();
        boolean boolean11 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo12.retiraAresta(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        grafo8.imprime();
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) '4', (int) ' ');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        boolean boolean8 = grafo5.listaAdjVazia((int) (byte) 10);
        grafo5.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        boolean boolean14 = grafo7.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta16 = grafo7.primeiroListaAdj(1);
        ds.Grafo.Aresta aresta18 = grafo7.primeiroListaAdj(52);
        grafo7.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo grafo1 = new ds.Grafo(32);
        boolean boolean3 = grafo1.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo1.existeAresta((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 10);
        int int14 = grafo1.numVertices();
        boolean boolean16 = grafo1.listaAdjVazia((int) (short) 10);
        int int17 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) '#', (int) (short) -1);
        grafo5.insereAresta((int) (short) 0, (int) (byte) 100, 10);
        grafo5.insereAresta((int) (byte) 0, (int) '#', 0);
        grafo5.imprime();
        ds.Grafo.Aresta aresta20 = grafo5.retiraAresta(0, (int) (byte) 100);
        int int21 = aresta20.peso();
        int int22 = aresta20.v1();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo7.primeiroListaAdj((int) (short) 0);
        int int13 = grafo7.numVertices();
        grafo7.insereAresta(0, (int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 0, (-1), (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(0);
        int int21 = aresta20.peso();
        int int22 = aresta20.peso();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        boolean boolean12 = grafo1.existeAresta((int) (short) 0, 10);
        grafo1.insereAresta(1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, (int) '#', (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(0, (int) 'a');
        grafo1.insereAresta(1, 32, 0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 1, (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta(35, 0, (int) 'a');
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) ' ');
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo6.imprime();
        boolean boolean11 = grafo6.existeAresta((int) (byte) 0, (int) (short) 1);
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        int int13 = grafo6.numVertices();
        int int14 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo6.retiraAresta((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) 'a', (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        boolean boolean9 = grafo6.listaAdjVazia(32);
        int int10 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 10);
        int int14 = grafo1.numVertices();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        boolean boolean16 = grafo13.existeAresta((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(1, (int) '4', 97);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        boolean boolean20 = grafo1.existeAresta(0, (int) 'a');
        boolean boolean22 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        boolean boolean10 = grafo7.listaAdjVazia((int) (short) 1);
        grafo7.insereAresta((int) (short) 1, 1, 1);
        int int15 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        grafo14.imprime();
        boolean boolean19 = grafo14.existeAresta(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 10);
        int int14 = grafo1.numVertices();
        grafo1.insereAresta((int) (short) 10, 0, 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        int int12 = grafo11.numVertices();
        grafo11.insereAresta(1, (int) ' ', 52);
        grafo11.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta((int) (short) 1, (-1));
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.existeAresta((int) (short) 10, (int) '4');
        int int14 = grafo1.numVertices();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo15.primeiroListaAdj(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) (byte) 1, (int) (short) -1, 100);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (byte) 0, (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        grafo1.imprime();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) ' ', (int) (byte) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, (int) '#', (int) (byte) 10);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(32);
        grafo12.insereAresta((int) ' ', (-1), 97);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta(0, (int) (byte) 10);
        int int8 = grafo1.numVertices();
        int int9 = grafo1.numVertices();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        int int11 = grafo10.numVertices();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) (short) 0, (int) (byte) -1, 52);
        grafo1.imprime();
        grafo1.insereAresta(35, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 10, 1, 97);
        boolean boolean8 = grafo1.listaAdjVazia((int) '#');
        ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int) (byte) 10, 0);
        grafo1.insereAresta((int) (byte) 0, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        int int13 = grafo7.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo7.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        grafo8.insereAresta(35, 0, (int) (byte) 0);
        grafo8.insereAresta(35, (-1), (int) (short) 100);
        boolean boolean18 = grafo8.listaAdjVazia((int) '4');
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = aresta11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = aresta15.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.insereAresta(1, 35, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo8 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) ' ');
        grafo1.insereAresta(32, (int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 0, (-1), (int) (byte) 0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(0);
        int int21 = grafo1.numVertices();
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta((int) (short) 1, (-1));
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (byte) 10);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta((int) (byte) 1, 35, (int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (-1), (int) 'a');
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        boolean boolean7 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Grafo grafo1 = new ds.Grafo(97);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        int int6 = grafo2.numVertices();
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) '4');
        int int9 = grafo2.numVertices();
        boolean boolean12 = grafo2.existeAresta((int) (short) 1, 100);
        ds.Grafo grafo13 = grafo2.grafoTransposto();
        ds.Grafo grafo14 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) '4');
        grafo14.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.insereAresta(0, (int) '#', (int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        boolean boolean21 = grafo1.existeAresta((int) '#', (int) (byte) -1);
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) '4');
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) (byte) 1);
        boolean boolean28 = grafo24.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo24.insereAresta((-1), (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int14 = aresta13.v1();
        int int15 = aresta13.v2();
        int int16 = aresta13.v2();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.imprime();
        boolean boolean18 = grafo14.existeAresta(0, (int) '#');
        java.lang.Class<?> wildcardClass19 = grafo14.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean4 = grafo1.existeAresta(35, 10);
        int int5 = grafo1.numVertices();
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
        int int9 = grafo1.numVertices();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) -1, 35);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Grafo grafo1 = new ds.Grafo(100);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass4 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.insereAresta(0, (int) '#', (int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        boolean boolean21 = grafo1.existeAresta((int) '#', (int) (byte) -1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta(97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 1, (-1));
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean3 = grafo1.listaAdjVazia(0);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) '4', (int) '#');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        boolean boolean12 = grafo1.existeAresta((int) (short) 0, 10);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        boolean boolean3 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(1);
        java.lang.Class<?> wildcardClass17 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, 97);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo1.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) ' ');
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo8.retiraAresta(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        int int16 = aresta15.v2();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 32, 1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        boolean boolean10 = grafo7.listaAdjVazia((int) (short) 1);
        grafo7.imprime();
        boolean boolean13 = grafo7.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) ' ', (int) (short) 100);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        boolean boolean14 = grafo7.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta16 = grafo7.primeiroListaAdj(1);
        boolean boolean18 = grafo7.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta20 = grafo7.primeiroListaAdj((int) (short) 10);
        grafo7.imprime();
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) (short) 10);
        grafo14.imprime();
        int int18 = grafo14.numVertices();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aresta11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Grafo grafo1 = new ds.Grafo(1);
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.insereAresta(0, (int) '#', (int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        boolean boolean21 = grafo1.existeAresta((int) '#', (int) (byte) -1);
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) '4');
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        int int25 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (-1), 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        int int3 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        boolean boolean10 = grafo8.listaAdjVazia((int) (byte) 0);
        grafo8.imprime();
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 100);
        boolean boolean4 = grafo1.existeAresta(35, 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (byte) 0, (int) (short) 100);
        grafo1.insereAresta(10, (int) '#', (int) 'a');
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj(1);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) (byte) 100, (int) ' ');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        grafo1.insereAresta(0, (int) '#', (int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        boolean boolean21 = grafo1.existeAresta((int) '#', (int) (byte) -1);
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) '4');
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int) (byte) 1);
        int int27 = aresta26.v2();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(aresta13);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(aresta26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.insereAresta(1, 35, (int) (byte) 10);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int) (short) 1, 32);
        boolean boolean24 = grafo1.existeAresta((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}

