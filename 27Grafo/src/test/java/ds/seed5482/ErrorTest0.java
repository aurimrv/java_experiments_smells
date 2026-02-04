package ds.seed5482;

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
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        grafo4.imprime();
        ds.Grafo.Aresta aresta7 = grafo4.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo4.proxAdj(1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        grafo1.insereAresta(0, 1, (int) (byte) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        grafo1.insereAresta(0, 1, (int) (byte) 1);
        grafo1.insereAresta((int) (short) 1, (int) (short) 100, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo(10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta((int) (short) 1, (int) '#');
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo4.proxAdj((int) (short) 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj(0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        grafo1.insereAresta(0, 1, (int) (byte) 1);
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        boolean boolean6 = grafo2.existeAresta(0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj(0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(32);
        int int4 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        grafo1.insereAresta(0, 1, (int) (byte) 1);
        int int7 = grafo1.numVertices();
        int int8 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (short) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 1);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        boolean boolean6 = grafo2.existeAresta(0, (int) '4');
        int int7 = grafo2.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj((int) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo(10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo((int) '4');
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(32);
        int int4 = grafo1.numVertices();
        int int5 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(32);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo(10);
        int int2 = grafo1.numVertices();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int) (short) 1);
        int int8 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo(10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj(0);
        grafo5.imprime();
        ds.Grafo grafo9 = grafo5.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo5.proxAdj(0);
    }
}

