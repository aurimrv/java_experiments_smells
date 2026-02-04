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
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia((int) ' ');
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        grafo1.insereAresta((int) (byte) 10, 0, (int) '#');
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.insereAresta(10, 32, (int) 'a');
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, 35, (int) (short) -1);
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (short) 10, (int) (byte) 100);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        boolean boolean21 = grafo13.existeAresta((int) (byte) 1, 97);
        grafo13.insereAresta((int) 'a', (int) (byte) 1, (int) (short) 0);
        boolean boolean28 = grafo13.existeAresta(0, 10);
        ds.Grafo grafo29 = grafo13.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(grafo29);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo9.imprime();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo9.existeAresta(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.insereAresta((int) '4', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean24 = grafo1.listaAdjVazia(35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo1.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        ds.Grafo.Aresta aresta11 = grafo7.primeiroListaAdj((int) ' ');
        boolean boolean14 = grafo7.existeAresta(0, 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, 100, 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean12 = grafo1.listaAdjVazia(97);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 10, 35);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass20 = grafo19.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) '4');
        grafo14.imprime();
        ds.Grafo.Aresta aresta19 = grafo14.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta22 = grafo14.retiraAresta(0, 1);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        grafo6.insereAresta(1, (int) ' ', 0);
        int int11 = grafo6.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo12 = grafo6.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.existeAresta((int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        int int20 = aresta19.v1();
        int int21 = aresta19.v1();
        java.lang.Class<?> wildcardClass22 = aresta19.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (short) 0, (int) '#');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (byte) 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        int int7 = aresta3.v1();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.existeAresta(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.insereAresta((int) ' ', (int) (byte) 10, 0);
        boolean boolean9 = grafo3.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (byte) 1, (int) ' ');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        grafo1.insereAresta(32, (int) (byte) -1, (int) 'a');
        boolean boolean20 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(52);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta3 = grafo1.proxAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.insereAresta((int) '4', (int) (short) 10, (int) (short) 1);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (short) 1, 35);
        int int26 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNull(aresta25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        boolean boolean13 = grafo1.existeAresta((int) (byte) 1, (int) '#');
        int int14 = grafo1.numVertices();
        int int15 = grafo1.numVertices();
        boolean boolean17 = grafo1.listaAdjVazia(97);
        boolean boolean20 = grafo1.existeAresta(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) ' ');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) 10, 32);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.insereAresta((int) (short) 10, 0, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        ds.Grafo grafo21 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) 10, (int) (short) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo grafo25 = grafo1.grafoTransposto();
        boolean boolean28 = grafo25.existeAresta(32, (int) (short) -1);
        grafo25.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta32 = grafo25.retiraAresta((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.retiraAresta((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 100, 35);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        boolean boolean26 = grafo1.existeAresta((int) (short) 1, (int) ' ');
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj((int) '4');
        ds.Grafo.Aresta aresta30 = grafo1.primeiroListaAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(aresta28);
        org.junit.Assert.assertNull(aresta30);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        grafo16.insereAresta(32, (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo16.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 10, (int) (byte) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, 35, (int) (short) -1);
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean15 = grafo1.existeAresta((int) (short) 10, (int) '#');
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo3.retiraAresta((int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 52, 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.insereAresta((int) (short) 10, 0, (int) (byte) 10);
        boolean boolean24 = grafo1.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) (short) 10, (int) (short) 100);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo5.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj(1);
        java.lang.Class<?> wildcardClass6 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.existeAresta((int) (byte) 10, 52);
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 0, (int) '4');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (short) 0, 0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        grafo10.insereAresta((int) 'a', (int) (short) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) -1, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        grafo14.insereAresta(0, (int) 'a', (int) (byte) -1);
        ds.Grafo grafo22 = grafo14.grafoTransposto();
        boolean boolean25 = grafo14.existeAresta((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo4.proxAdj(35);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean22 = grafo1.existeAresta((int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 0, (int) '4', (int) '#');
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo7.primeiroListaAdj(32);
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo7.primeiroListaAdj((int) '4');
        boolean boolean16 = grafo7.listaAdjVazia(10);
        boolean boolean18 = grafo7.listaAdjVazia(97);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', 1, 52);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta((int) (byte) 1, (int) (byte) 100, 32);
        int int6 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (short) 0, 0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta20 = grafo10.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(32);
        int int25 = aresta24.v1();
        int int26 = aresta24.v2();
        int int27 = aresta24.v2();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = aresta18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        int int20 = grafo13.numVertices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        boolean boolean14 = grafo11.existeAresta(97, 32);
        ds.Grafo.Aresta aresta17 = grafo11.retiraAresta((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        boolean boolean6 = grafo1.existeAresta((int) (short) 0, (int) '4');
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(32);
        boolean boolean18 = grafo1.existeAresta((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        grafo19.insereAresta((int) (byte) 10, (int) '4', (int) ' ');
        grafo19.imprime();
        ds.Grafo.Aresta aresta27 = grafo19.retiraAresta(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta27);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 100, 100);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 100, 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        boolean boolean7 = grafo2.listaAdjVazia(0);
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo18.insereAresta(97, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.existeAresta((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        boolean boolean21 = grafo14.existeAresta((int) (byte) 1, (int) (short) 1);
        grafo14.insereAresta((int) ' ', (int) (short) 0, (int) (byte) 100);
        int int26 = grafo14.numVertices();
        int int27 = grafo14.numVertices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, (int) 'a', (int) ' ');
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) '#', 97);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) '#', (int) (byte) 10);
        int int21 = grafo1.numVertices();
        ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(aresta23);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 10, (int) (byte) 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo13.existeAresta(0, (int) (byte) 100);
        ds.Grafo grafo18 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo1.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        int int6 = grafo3.numVertices();
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.insereAresta((int) 'a', (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo24 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(32);
        boolean boolean21 = grafo1.listaAdjVazia((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = grafo1.existeAresta(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        boolean boolean23 = grafo1.existeAresta(97, 32);
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.imprime();
        java.lang.Class<?> wildcardClass5 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.insereAresta(32, 1, 0);
        int int11 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo1.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) 0, 32);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) (short) 100, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = aresta11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.insereAresta((int) 'a', (-1), (int) (short) -1);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj(0);
        boolean boolean25 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 0, (int) (short) 10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', 10);
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        java.lang.Class<?> wildcardClass15 = grafo10.getClass();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo2.retiraAresta((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 97, (int) 'a');
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 52, (int) (byte) 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean19 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo grafo20 = grafo1.grafoTransposto();
        boolean boolean22 = grafo20.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        boolean boolean11 = grafo1.existeAresta((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass12 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) (short) -1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo1.existeAresta((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (short) 0, 0);
        ds.Grafo grafo18 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta20 = grafo10.proxAdj((int) '4');
        ds.Grafo grafo21 = grafo10.grafoTransposto();
        ds.Grafo grafo22 = grafo21.grafoTransposto();
        boolean boolean25 = grafo21.existeAresta(32, 1);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(grafo21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo3.retiraAresta((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(1);
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean21 = grafo1.listaAdjVazia(97);
        grafo1.insereAresta((int) (byte) 1, (int) '4', (int) (short) 10);
        grafo1.insereAresta((int) (byte) 10, (int) '4', 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo1.listaAdjVazia((int) ' ');
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        boolean boolean16 = grafo1.listaAdjVazia(10);
        java.lang.Class<?> wildcardClass17 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta(35, (int) (byte) 1);
        int int16 = grafo1.numVertices();
        int int17 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo3.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) (byte) 0, 32);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean18 = grafo13.existeAresta((int) (short) 1, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (byte) 10);
        grafo13.imprime();
        boolean boolean23 = grafo13.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, 97);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(32, 1, 35);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta(32, 35);
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) 'a', 0, 100);
        grafo1.imprime();
        grafo1.imprime();
        boolean boolean12 = grafo1.listaAdjVazia(32);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 10, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.insereAresta((int) '4', (int) (short) 10, (int) (short) 1);
        int int21 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta(35, (int) (byte) 1);
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo16.primeiroListaAdj((int) (byte) 10);
        boolean boolean21 = grafo16.existeAresta((int) (short) 10, 35);
        grafo16.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        grafo1.insereAresta((int) 'a', (-1), (int) (short) -1);
        boolean boolean23 = grafo1.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = grafo1.existeAresta((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        boolean boolean12 = grafo3.listaAdjVazia((int) (byte) 1);
        grafo3.insereAresta(0, (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) 'a', (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta(10, (int) (byte) -1);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        int int18 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, (int) (short) 100, 0);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        ds.Grafo.Aresta aresta11 = grafo7.primeiroListaAdj((int) ' ');
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 10, 0);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int9 = grafo1.numVertices();
        boolean boolean12 = grafo1.existeAresta(0, 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        grafo1.insereAresta(97, (int) '4', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo1.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) 'a', 35);
        int int4 = aresta3.peso();
        java.lang.Class<?> wildcardClass5 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        grafo13.insereAresta(52, 10, (int) (byte) 1);
        ds.Grafo grafo24 = grafo13.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(aresta19);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia(0);
        boolean boolean19 = grafo15.listaAdjVazia(97);
        grafo15.insereAresta((int) (byte) 10, (int) (byte) -1, (int) '#');
        int int24 = grafo15.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo15.retiraAresta(97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.retiraAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int) ' ', 10);
        int int14 = grafo10.numVertices();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 1, (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        boolean boolean17 = grafo1.existeAresta((int) '4', 32);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo18.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 1, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo2.listaAdjVazia(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) (short) 10, (int) (short) 10);
        int int18 = grafo14.numVertices();
        ds.Grafo grafo19 = grafo14.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(aresta23);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        grafo18.imprime();
        ds.Grafo grafo20 = grafo18.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo20.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        boolean boolean6 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean16 = grafo13.listaAdjVazia((int) (short) 10);
        boolean boolean19 = grafo13.existeAresta((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj((int) '#');
        ds.Grafo.Aresta aresta20 = grafo15.primeiroListaAdj(52);
        ds.Grafo.Aresta aresta22 = grafo15.proxAdj(32);
        int int23 = aresta22.v2();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        java.lang.Class<?> wildcardClass6 = grafo3.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo15.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean6 = grafo3.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        int int18 = grafo1.numVertices();
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (short) 100, 32);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', (int) (byte) 10, 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 35, (int) (short) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 1, (int) (short) 10);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        int int4 = grafo3.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        boolean boolean20 = grafo1.existeAresta(32, 0);
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 10);
        grafo8.insereAresta((int) ' ', 0, 0);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(97);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 0, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        grafo10.insereAresta((int) 'a', 10, (int) 'a');
        ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo10.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        int int19 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta22 = grafo1.retiraAresta(97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, 35, (int) (short) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(aresta26);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo11.imprime();
        ds.Grafo.Aresta aresta14 = grafo11.primeiroListaAdj((int) (short) 1);
        grafo11.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) -1, (int) (byte) 0);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) 10, 32);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean18 = grafo13.existeAresta((int) (short) 1, (int) 'a');
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (byte) 10);
        boolean boolean22 = grafo13.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo13.existeAresta(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
        ds.Grafo grafo1 = new ds.Grafo(1);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia(0);
        boolean boolean19 = grafo15.listaAdjVazia(97);
        grafo15.insereAresta((int) (byte) 10, (int) (byte) -1, (int) '#');
        boolean boolean25 = grafo15.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int15 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        int int21 = aresta20.v1();
        int int22 = aresta20.v2();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 0, 52);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean18 = grafo1.existeAresta(10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta(100, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int) ' ', (int) (short) 100);
        grafo14.insereAresta(0, (int) 'a', (int) (byte) -1);
        ds.Grafo.Aresta aresta23 = grafo14.proxAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = grafo14.existeAresta((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int) '#');
        boolean boolean25 = grafo1.existeAresta((int) (short) 0, (int) ' ');
        grafo1.imprime();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) ' ');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        grafo16.insereAresta(32, (int) (byte) 10, (int) '#');
        boolean boolean22 = grafo16.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta24 = grafo16.proxAdj((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(aresta24);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        boolean boolean17 = grafo1.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (short) 0);
        boolean boolean15 = grafo1.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        boolean boolean13 = grafo1.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) 'a', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 100, (int) (short) 1);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (short) 1, (int) (short) 10);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (byte) 1);
        ds.Grafo grafo20 = grafo17.grafoTransposto();
        grafo17.insereAresta((int) ' ', 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        boolean boolean17 = grafo13.listaAdjVazia((int) '4');
        int int18 = grafo13.numVertices();
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(aresta20);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo4.primeiroListaAdj((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), (int) (short) 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        int int17 = grafo1.numVertices();
        boolean boolean20 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo21 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        boolean boolean20 = grafo1.existeAresta(32, 0);
        ds.Grafo grafo21 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(grafo21);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (-1));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean16 = grafo1.existeAresta(0, (int) (byte) 1);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (byte) 1);
        boolean boolean21 = grafo17.listaAdjVazia(0);
        boolean boolean23 = grafo17.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta26 = grafo17.retiraAresta((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta(10, 35, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1227");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, (int) 'a', 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1228");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 32, (int) (byte) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1229");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (byte) -1, (int) '#');
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        int int9 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1230");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 0, (int) (byte) 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1231");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        ds.Grafo grafo24 = grafo23.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta27 = grafo24.retiraAresta((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(grafo24);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1232");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) (byte) 0);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int) (short) 10);
        int int24 = aresta23.peso();
        org.junit.Assert.assertNotNull(aresta23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1233");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj(32);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1234");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.insereAresta((int) (short) 1, 10, 0);
        grafo1.imprime();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo1.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1235");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        grafo1.imprime();
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1236");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.imprime();
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1237");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) '#', (int) (byte) 10);
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1238");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) 'a', (int) 'a');
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1239");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1240");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        int int5 = grafo4.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1241");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 10);
        int int11 = grafo8.numVertices();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1242");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int) (short) 0);
        int int13 = aresta12.v2();
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1243");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 52, 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1244");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass23 = grafo22.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1245");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo7.listaAdjVazia((int) ' ');
        ds.Grafo.Aresta aresta13 = grafo7.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta15 = grafo7.proxAdj((int) '4');
        ds.Grafo grafo16 = grafo7.grafoTransposto();
        boolean boolean19 = grafo7.existeAresta((int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1246");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        ds.Grafo grafo24 = grafo23.grafoTransposto();
        ds.Grafo.Aresta aresta26 = grafo24.primeiroListaAdj(52);
        int int27 = grafo24.numVertices();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNull(aresta26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1247");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (short) 10, (int) '4');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1248");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        int int24 = grafo23.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = grafo23.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1249");
        ds.Grafo grafo1 = new ds.Grafo(0);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta((int) ' ', 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1250");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean19 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) 'a');
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNotNull(aresta23);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1251");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        ds.Grafo grafo24 = grafo23.grafoTransposto();
        grafo24.imprime();
        ds.Grafo grafo26 = grafo24.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(grafo26);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1252");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.insereAresta(97, 97, (int) (byte) 1);
        boolean boolean21 = grafo13.existeAresta(97, 100);
        int int22 = grafo13.numVertices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1253");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        boolean boolean19 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj((int) '#');
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        boolean boolean25 = grafo1.existeAresta(0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1254");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        int int12 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1255");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(32);
        grafo1.insereAresta((int) (short) 0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1256");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        grafo1.insereAresta((int) '4', (int) (short) 0, (int) (byte) 0);
        int int22 = grafo1.numVertices();
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1257");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (short) -1, (int) '#');
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1258");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) -1, 32);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1259");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (short) 100, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1260");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 1, (int) (short) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1261");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean19 = grafo1.existeAresta((int) 'a', 100);
        grafo1.insereAresta((int) '4', (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1262");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, 0, (int) (short) 10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1263");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean9 = grafo1.existeAresta((int) (short) 10, 52);
        grafo1.insereAresta(0, 35, (int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1264");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 1, 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1265");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 97);
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1266");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(32);
        grafo1.insereAresta(97, (int) 'a', 32);
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1267");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1268");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        int int18 = grafo17.numVertices();
        ds.Grafo grafo19 = grafo17.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1269");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        int int9 = grafo1.numVertices();
        grafo1.insereAresta((int) '4', (int) '4', 52);
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1270");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1271");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (byte) -1, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1272");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        int int21 = aresta20.peso();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1273");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1274");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) -1, (int) (byte) 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1275");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (byte) 10, 35, 32);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(10);
        int int22 = aresta21.peso();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1276");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        ds.Grafo grafo19 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta21 = grafo19.primeiroListaAdj(35);
        int int22 = aresta21.v2();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo19);
        org.junit.Assert.assertNotNull(aresta21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1277");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1278");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo15.numVertices();
        ds.Grafo.Aresta aresta18 = grafo15.primeiroListaAdj((int) '#');
        boolean boolean21 = grafo15.existeAresta(1, (int) (byte) 100);
        ds.Grafo grafo22 = grafo15.grafoTransposto();
        int int23 = grafo22.numVertices();
        ds.Grafo.Aresta aresta25 = grafo22.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(grafo22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNull(aresta25);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1279");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(32, (int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) (short) 10, (int) ' ', (int) (short) -1);
        ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int) (short) 10, 32);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        java.lang.Class<?> wildcardClass24 = grafo1.getClass();
        org.junit.Assert.assertNotNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
        org.junit.Assert.assertNotNull(grafo23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1280");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        ds.Grafo grafo19 = grafo18.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1281");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1282");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 52, (int) (short) 1);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1283");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, 0, (int) 'a');
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1284");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        grafo1.insereAresta(35, (int) (short) 1, (-1));
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1285");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        grafo1.imprime();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1286");
        ds.Grafo grafo1 = new ds.Grafo(100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1287");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj(1);
        boolean boolean19 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass26 = grafo1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(aresta21);
        org.junit.Assert.assertNull(aresta23);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1288");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta24 = grafo1.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1289");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo grafo25 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(aresta24);
        org.junit.Assert.assertNotNull(grafo25);
        org.junit.Assert.assertNull(aresta28);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1290");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) '#', (-1));
        int int16 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo18 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1291");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        int int13 = grafo1.numVertices();
        boolean boolean15 = grafo1.listaAdjVazia(32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1292");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1293");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        int int2 = grafo1.numVertices();
        boolean boolean4 = grafo1.listaAdjVazia((int) '#');
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1294");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = aresta3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1295");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        grafo1.insereAresta((int) (short) 1, (int) (short) 1, (int) 'a');
        ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj((int) (short) 1);
        int int27 = aresta26.v2();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1296");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        boolean boolean20 = grafo1.existeAresta(32, 0);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(35);
        int int23 = grafo1.numVertices();
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        grafo24.insereAresta((int) (byte) 0, 10, (int) 'a');
        int int29 = grafo24.numVertices();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(grafo24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1297");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 1, (-1), 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1298");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean15 = grafo13.listaAdjVazia(10);
        ds.Grafo.Aresta aresta17 = grafo13.proxAdj(10);
        ds.Grafo grafo18 = grafo13.grafoTransposto();
        grafo13.insereAresta((int) '#', 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1299");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 1, (int) (short) 1, 10);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1300");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1301");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) 10, 32);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1302");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1303");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean11 = grafo1.existeAresta((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass12 = grafo1.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1304");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1305");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj(1);
        boolean boolean8 = grafo3.existeAresta((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo3.retiraAresta((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1306");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean7 = grafo1.existeAresta((int) (short) 0, 100);
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1307");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, 0, 100);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1308");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(35);
        int int17 = aresta16.peso();
        int int18 = aresta16.v2();
        int int19 = aresta16.v2();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1309");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', (-1), 1);
        int int4 = aresta3.v2();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1310");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.insereAresta(10, 35, (int) (byte) 100);
        grafo2.insereAresta((int) (byte) 1, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1311");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 1, 32);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1312");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1313");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (short) 10);
        grafo1.insereAresta(1, 100, (int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1314");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', 97, (int) (byte) -1);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1315");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo11.imprime();
        ds.Grafo grafo13 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo11.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1316");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta((int) '#', (int) (short) 0);
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1317");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.insereAresta((int) '4', (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1318");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (byte) 10, 1);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1319");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.retiraAresta((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1320");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1321");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(35);
        int int17 = aresta16.peso();
        int int18 = aresta16.peso();
        int int19 = aresta16.v2();
        int int20 = aresta16.peso();
        int int21 = aresta16.v1();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1322");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, 35, (int) (short) -1);
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo13 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1323");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo11.insereAresta((int) 'a', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1324");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta8 = grafo4.primeiroListaAdj(97);
        int int9 = grafo4.numVertices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1325");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) ' ', 32);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1326");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }
}

