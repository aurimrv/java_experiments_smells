package ds.seed5311;

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
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        boolean boolean11 = grafo2.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo2.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 100, (int) (byte) 10, (int) 'a');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (-1), (int) '#');
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        int int9 = grafo7.numVertices();
        grafo7.imprime();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 52, (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        grafo8.imprime();
        int int10 = grafo8.numVertices();
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo8.existeAresta(97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        int int9 = grafo8.numVertices();
        ds.Grafo grafo10 = grafo8.grafoTransposto();
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta((int) (short) 0, 97);
        ds.Grafo.Aresta aresta13 = grafo8.primeiroListaAdj(0);
        ds.Grafo grafo14 = grafo8.grafoTransposto();
        grafo14.insereAresta((int) (byte) 1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 10, (int) '4');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v2();
        int int11 = aresta3.peso();
        int int12 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo6.insereAresta(0, (int) (byte) 0, (int) (byte) 1);
        boolean boolean13 = grafo6.existeAresta(1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo6.retiraAresta((int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo10.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta((int) '#', 1);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        grafo2.imprime();
        boolean boolean9 = grafo2.existeAresta(1, (int) 'a');
        int int10 = grafo2.numVertices();
        int int11 = grafo2.numVertices();
        grafo2.insereAresta((int) (short) 1, (int) '#', 52);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo6.insereAresta(0, (int) (byte) 0, (int) (byte) 1);
        boolean boolean13 = grafo6.existeAresta(1, (int) (short) -1);
        ds.Grafo grafo14 = grafo6.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 1);
        boolean boolean7 = grafo1.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo9.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        grafo7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta18 = grafo7.retiraAresta(52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 0, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj(0);
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (short) 100);
        boolean boolean12 = grafo1.existeAresta(0, (int) (byte) -1);
        int int13 = grafo1.numVertices();
        int int14 = grafo1.numVertices();
        int int15 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        grafo1.insereAresta((int) (byte) 0, 52, (int) '#');
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean3 = grafo1.listaAdjVazia(1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        grafo7.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 0, 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        int int2 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) (byte) 0, (int) (short) -1);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        boolean boolean10 = grafo7.listaAdjVazia(0);
        boolean boolean12 = grafo7.listaAdjVazia((int) (byte) 0);
        grafo7.insereAresta(0, (-1), 35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta19 = grafo7.retiraAresta(32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        int int5 = grafo2.numVertices();
        int int6 = grafo2.numVertices();
        boolean boolean8 = grafo2.listaAdjVazia(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        int int11 = grafo8.numVertices();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo12.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        int int8 = grafo2.numVertices();
        int int9 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo2.listaAdjVazia(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Grafo grafo1 = new ds.Grafo(32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo2.primeiroListaAdj((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 10, (int) '#');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (short) 100);
        boolean boolean12 = grafo1.existeAresta(0, (int) (byte) -1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo1.listaAdjVazia(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        boolean boolean8 = grafo2.existeAresta((int) (short) 0, 0);
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        ds.Grafo grafo10 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        int int8 = grafo2.numVertices();
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        ds.Grafo grafo10 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (short) 0, (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 35, 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 35);
        int int4 = aresta3.peso();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '#', 97, (int) (short) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, (int) '#', (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) 10, 10);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 10, 10, (-1));
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo2.retiraAresta((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        int int5 = grafo2.numVertices();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 0);
        int int7 = grafo1.numVertices();
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(0, 100, (int) (byte) 10);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        grafo5.imprime();
        ds.Grafo grafo11 = grafo5.grafoTransposto();
        grafo5.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj((int) (byte) 0);
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo2.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(10, (int) 'a', 10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) (short) 0, (int) (short) 1, (-1));
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.insereAresta((int) (byte) 1, (int) ' ', 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 0);
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo14.existeAresta((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        java.lang.Class<?> wildcardClass6 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        boolean boolean8 = grafo2.existeAresta((int) (short) 0, 0);
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        grafo9.imprime();
        int int11 = grafo9.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo3.retiraAresta((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean3 = grafo1.listaAdjVazia(1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        grafo7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta17 = grafo7.primeiroListaAdj((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        grafo2.imprime();
        boolean boolean9 = grafo2.existeAresta(1, (int) 'a');
        int int10 = grafo2.numVertices();
        boolean boolean13 = grafo2.existeAresta((int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo2.retiraAresta(35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.insereAresta(0, 0, 0);
        grafo1.insereAresta((int) (byte) 0, 10, 32);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, (int) (byte) 1, 97);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Grafo grafo1 = new ds.Grafo(35);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int) (short) 0);
        int int14 = grafo11.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo11.listaAdjVazia((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo6.numVertices();
        ds.Grafo.Aresta aresta9 = grafo6.proxAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 0);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        grafo5.imprime();
        grafo5.imprime();
        ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        boolean boolean11 = grafo8.existeAresta(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) '4', 0, (int) (byte) 1);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        int int7 = aresta3.v2();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(0, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo grafo9 = grafo1.grafoTransposto();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) ' ', (int) (byte) -1, 97);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), (int) (short) -1, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.v2();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) '#');
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v2();
        int int6 = aresta3.v1();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.imprime();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        boolean boolean13 = grafo7.existeAresta((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, (int) (short) 0, 52);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(52, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, 0, 10);
        int int4 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo7.primeiroListaAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        int int16 = grafo15.numVertices();
        java.lang.Class<?> wildcardClass17 = grafo15.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        int int13 = grafo12.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 10, (int) (short) -1, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        boolean boolean11 = grafo2.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        int int8 = grafo5.numVertices();
        int int9 = grafo5.numVertices();
        ds.Grafo.Aresta aresta11 = grafo5.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo5.proxAdj(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        boolean boolean8 = grafo2.existeAresta((int) (short) 0, 0);
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        ds.Grafo grafo10 = grafo2.grafoTransposto();
        ds.Grafo grafo11 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo2.existeAresta((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        grafo1.imprime();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass7 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        grafo12.imprime();
        java.lang.Class<?> wildcardClass14 = grafo12.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        grafo2.imprime();
        int int14 = grafo2.numVertices();
        ds.Grafo.Aresta aresta17 = grafo2.retiraAresta((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta13 = grafo1.retiraAresta(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v2();
        int int9 = aresta3.v2();
        int int10 = aresta3.peso();
        int int11 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.peso();
        int int10 = aresta3.v2();
        int int11 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        grafo2.insereAresta(0, (int) ' ', 32);
        ds.Grafo.Aresta aresta9 = grafo2.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(aresta9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        boolean boolean13 = grafo7.existeAresta(0, (int) (byte) 0);
        ds.Grafo.Aresta aresta15 = grafo7.primeiroListaAdj((int) (byte) 0);
        boolean boolean17 = grafo7.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo7.existeAresta((-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) ' ', 35);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 0, 0, (int) (byte) 10);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '4', (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) (short) 0, 52);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj(0);
        ds.Grafo grafo13 = grafo7.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta16 = grafo7.retiraAresta((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) ' ', (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.imprime();
        boolean boolean6 = grafo3.listaAdjVazia((int) (byte) 1);
        int int7 = grafo3.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo3.existeAresta((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        boolean boolean13 = grafo8.existeAresta(0, 0);
        grafo8.insereAresta((int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.peso();
        int int8 = aresta3.peso();
        int int9 = aresta3.peso();
        int int10 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta6 = grafo2.retiraAresta(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia(1);
        boolean boolean7 = grafo1.existeAresta((int) (byte) 0, (int) (short) -1);
        int int8 = grafo1.numVertices();
        grafo1.insereAresta(1, 97, (int) (short) 100);
        int int13 = grafo1.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo1.existeAresta(0, (int) '#');
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo6.imprime();
        int int8 = grafo6.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        ds.Grafo grafo11 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo2.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v2();
        int int5 = aresta3.peso();
        int int6 = aresta3.v2();
        int int7 = aresta3.v1();
        int int8 = aresta3.peso();
        int int9 = aresta3.v1();
        int int10 = aresta3.v1();
        int int11 = aresta3.v2();
        int int12 = aresta3.v2();
        int int13 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 35, (int) '4');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Grafo grafo1 = new ds.Grafo(97);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 1);
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Grafo grafo1 = new ds.Grafo(10);
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, (int) (byte) -1);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo1.listaAdjVazia((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        int int7 = grafo2.numVertices();
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        boolean boolean5 = grafo2.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo2.retiraAresta(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo2.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo2.existeAresta((int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo2.retiraAresta((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(0, 10, (int) '#');
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, 10, (int) '4');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo3.numVertices();
        grafo3.insereAresta(0, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = grafo3.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '4', (int) (byte) 100);
        int int4 = aresta3.peso();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((-1), 0, (int) '#');
        int int4 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        grafo7.imprime();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) 100, 35, 35);
        int int4 = aresta3.peso();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        grafo7.imprime();
        ds.Grafo.Aresta aresta18 = grafo7.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta(10, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 1);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta(32, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Grafo grafo1 = new ds.Grafo(52);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo1.imprime();
        java.lang.Class<?> wildcardClass5 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(100, (int) (byte) 1, (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        boolean boolean7 = grafo5.listaAdjVazia((int) (short) 1);
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) 'a', (int) (short) 10, 0);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.v1();
        int int7 = aresta3.peso();
        int int8 = aresta3.v1();
        int int9 = aresta3.v2();
        int int10 = aresta3.v1();
        int int11 = aresta3.v2();
        int int12 = aresta3.v1();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(1, (int) (short) 1, 10);
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        int int6 = aresta3.peso();
        java.lang.Class<?> wildcardClass7 = aresta3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Grafo grafo1 = new ds.Grafo(32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo1.existeAresta((int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(97, 100, (int) (byte) 1);
        int int4 = aresta3.v2();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(1);
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        grafo2.imprime();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (short) 100);
        boolean boolean12 = grafo1.existeAresta(0, (int) (byte) -1);
        boolean boolean15 = grafo1.existeAresta((int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) '#', (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.imprime();
        int int5 = grafo3.numVertices();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo3.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        grafo2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta7 = grafo2.retiraAresta(35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.Grafo grafo1 = new ds.Grafo(52);
        boolean boolean3 = grafo1.listaAdjVazia(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta(35, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = aresta3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo1.existeAresta((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Grafo.Aresta aresta8 = grafo1.proxAdj(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo2.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (byte) -1, (int) '#', (int) ' ');
        int int4 = aresta3.v1();
        int int5 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        int int11 = grafo8.numVertices();
        int int12 = grafo8.numVertices();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        int int8 = grafo7.numVertices();
        ds.Grafo grafo9 = grafo7.grafoTransposto();
        int int10 = grafo7.numVertices();
        grafo7.insereAresta((int) (short) 0, (int) (short) 0, 0);
        ds.Grafo grafo15 = grafo7.grafoTransposto();
        grafo7.imprime();
        ds.Grafo.Aresta aresta18 = grafo7.primeiroListaAdj(0);
        int int19 = aresta18.v1();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean8 = grafo5.existeAresta((int) ' ', (-1));
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        ds.Grafo.Aresta aresta3 = new ds.Grafo.Aresta((int) (short) -1, (int) '4', (int) (byte) 100);
        int int4 = aresta3.v1();
        int int5 = aresta3.v1();
        int int6 = aresta3.peso();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }
}

