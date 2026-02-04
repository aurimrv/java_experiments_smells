package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        boolean boolean7 = grafo1.listaAdjVazia((int) (byte) 0);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        int int10 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        boolean boolean6 = grafo2.listaAdjVazia(35);
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj((int) '#');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) ' ', (int) '#', (int) 'a');
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (byte) 0);
        grafo3.imprime();
        boolean boolean14 = grafo3.existeAresta(97, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo3.proxAdj((int) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo4.proxAdj((int) (byte) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        boolean boolean6 = grafo2.listaAdjVazia(35);
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        grafo7.imprime();
        ds.Grafo.Aresta aresta10 = grafo7.primeiroListaAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj(35);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta(32, 10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.imprime();
        boolean boolean11 = grafo7.existeAresta((int) (byte) 0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo7.proxAdj((int) '4');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        boolean boolean6 = grafo2.listaAdjVazia(35);
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj((int) (byte) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean11 = grafo1.existeAresta((int) (byte) 0, (int) (short) 0);
        int int12 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj(0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(35);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (byte) 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        boolean boolean7 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo(1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta(32, 10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 0);
        boolean boolean11 = grafo1.existeAresta((int) (byte) 0, (int) (short) 0);
        int int12 = grafo1.numVertices();
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int) (short) 10);
        boolean boolean6 = grafo2.listaAdjVazia(35);
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        grafo7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int) (byte) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta(32, 10);
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo7.imprime();
        boolean boolean11 = grafo7.existeAresta((int) (byte) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        grafo12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int) '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) ' ');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) ' ', (int) '#', (int) 'a');
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (byte) 0);
        boolean boolean12 = grafo3.listaAdjVazia((int) '4');
        boolean boolean15 = grafo3.existeAresta(52, (int) (short) 100);
        ds.Grafo.Aresta aresta17 = grafo3.proxAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo3.proxAdj((int) (byte) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo1 = new ds.Grafo(1);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (short) 0);
        boolean boolean8 = grafo1.existeAresta(0, 10);
        grafo1.insereAresta((int) (byte) 0, (int) (byte) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj(0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 0);
        grafo1.imprime();
        int int5 = grafo1.numVertices();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo4.numVertices();
        int int6 = grafo4.numVertices();
        grafo4.insereAresta(52, (-1), (int) '4');
        ds.Grafo.Aresta aresta12 = grafo4.proxAdj((int) (short) 0);
        grafo4.imprime();
        int int14 = grafo4.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo4.proxAdj((int) (byte) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) ' ', (int) '#', (int) 'a');
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (byte) 0);
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        grafo11.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo11.proxAdj((int) (byte) 0);
    }
}

