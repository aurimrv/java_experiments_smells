package ds.seed5311;

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
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        int int6 = grafo2.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj(0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo3.proxAdj(0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        boolean boolean7 = grafo2.existeAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo8 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo2.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta12 = grafo2.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo2.proxAdj(0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (short) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo2.proxAdj((int) (short) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (short) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo.Aresta aresta6 = grafo2.primeiroListaAdj(0);
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj(1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.imprime();
        grafo1.imprime();
        int int10 = grafo1.numVertices();
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj(0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.proxAdj(0);
        grafo2.insereAresta((int) (byte) 1, 1, (-1));
        ds.Grafo grafo9 = grafo2.grafoTransposto();
        int int10 = grafo2.numVertices();
        grafo2.imprime();
        ds.Grafo grafo12 = grafo2.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo2.proxAdj(1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        grafo1.insereAresta(1, (int) 'a', (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) (byte) 0, 97);
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) (short) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        int int3 = grafo1.numVertices();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) (byte) 0, 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int) (byte) 1);
        int int10 = grafo7.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj(1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia(0);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo1 = new ds.Grafo(10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        int int4 = grafo2.numVertices();
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo2.proxAdj(0);
    }
}

