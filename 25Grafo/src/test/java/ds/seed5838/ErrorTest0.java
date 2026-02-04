package ds.seed5838;

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
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int15 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj(1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) 'a', (int) (short) 0);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        int int10 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.insereAresta((int) (byte) 0, (int) '4', (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo0.proxAdj(32);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        int int11 = grafo9.numVertices();
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo9.proxAdj((int) (short) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean18 = grafo0.listaAdjVazia((int) (short) 1);
        boolean boolean20 = grafo0.listaAdjVazia((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        int int3 = grafo0.numVertices();
        boolean boolean5 = grafo0.listaAdjVazia(32);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj(52);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        boolean boolean12 = grafo9.listaAdjVazia(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int) (short) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta(10, 100, (int) (byte) 100);
        grafo9.imprime();
        ds.Grafo.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 10, (int) 'a');
        int int18 = grafo9.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo9.proxAdj((int) (short) 10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj(32);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.imprime();
        grafo12.insereAresta(97, (int) (byte) 1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo12.proxAdj((int) '4');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 1, (int) '4', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        grafo0.insereAresta(52, (int) (short) 100, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(52);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        grafo0.imprime();
        int int14 = grafo0.numVertices();
        boolean boolean16 = grafo0.listaAdjVazia(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) ' ');
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo8.proxAdj((int) (byte) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        boolean boolean17 = grafo0.listaAdjVazia(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.listaAdjVazia(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(35);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo13.proxAdj((int) ' ');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) 'a', (int) (short) 0);
        int int8 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, 0, (int) (short) 10);
        int int10 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj(35);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
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
        boolean boolean21 = grafo0.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo0.proxAdj(0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        boolean boolean8 = grafo0.existeAresta(32, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 10);
        ds.Grafo grafo18 = grafo0.grafoTransposto();
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        grafo0.insereAresta(97, 10, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo0.proxAdj(32);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 1, (int) (short) -1);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(35);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
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
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj(35);
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        ds.Grafo.Aresta aresta21 = grafo0.primeiroListaAdj((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo0.proxAdj(0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(1, (int) (byte) 0);
        int int9 = grafo0.numVertices();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int) (byte) 0);
        grafo10.insereAresta(52, 100, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo10.proxAdj(0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int15 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo0.proxAdj(97);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(32);
        grafo0.imprime();
        grafo0.insereAresta((int) '4', (int) (short) 1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean8 = grafo0.existeAresta(97, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo10.proxAdj((int) 'a');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 1, 10);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int11 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(32);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo6.proxAdj(35);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        boolean boolean9 = grafo0.listaAdjVazia(0);
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(1);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        grafo10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo10.proxAdj((int) '4');
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean5 = grafo0.existeAresta(32, 0);
        grafo0.insereAresta((int) (byte) 1, 0, (int) (byte) 0);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo10.proxAdj(0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo8.proxAdj((int) (byte) 0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) 'a', (int) (short) 1, 0);
        int int8 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 100);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) ' ');
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo8.proxAdj((int) '#');
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean5 = grafo0.existeAresta(10, 0);
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) (byte) 10, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
        grafo0.insereAresta((int) (byte) 0, (int) ' ', (int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo10.proxAdj(0);
        grafo10.insereAresta(1, (int) (short) 10, 0);
        boolean boolean18 = grafo10.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo19 = grafo10.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo10.proxAdj((int) (byte) 0);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) ' ');
    }
}

