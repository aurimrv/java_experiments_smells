package ds.seed7992;

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
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (short) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(35);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (short) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean15 = grafo1.existeAresta((int) (byte) 10, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj(32);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (short) 1, (int) (short) 10, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo11.proxAdj((int) '#');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        int int14 = grafo11.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo11.proxAdj(10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        int int13 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(32);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int) (short) 1);
        grafo1.imprime();
        grafo1.imprime();
        int int12 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo11.proxAdj(35);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        grafo1.imprime();
        grafo1.insereAresta(0, 97, 0);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj(32);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta((int) 'a', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj(32);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(32);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        boolean boolean10 = grafo1.listaAdjVazia((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) ' ');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        grafo1.insereAresta(97, (int) (byte) 100, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(52);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.imprime();
        boolean boolean17 = grafo11.existeAresta(0, (int) 'a');
        boolean boolean20 = grafo11.existeAresta(32, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo11.proxAdj(1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(32);
        ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 0);
        int int19 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo10.listaAdjVazia((int) '#');
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo10.primeiroListaAdj(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo10.proxAdj(1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) (short) 100, 10);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(97);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj((int) (short) 10);
        boolean boolean23 = grafo12.existeAresta(32, (int) (short) -1);
        ds.Grafo grafo24 = grafo12.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta26 = grafo12.proxAdj(52);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        grafo12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo12.proxAdj(35);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj((int) (byte) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo12.proxAdj((int) 'a');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(32, 100, (int) (short) 100);
        int int12 = grafo1.numVertices();
        grafo1.insereAresta(97, (int) (short) 0, (int) (short) 100);
        int int17 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        grafo1.imprime();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        int int6 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
        int int4 = grafo1.numVertices();
        boolean boolean6 = grafo1.listaAdjVazia(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj(1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj((int) (short) 10);
        boolean boolean23 = grafo12.existeAresta(32, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo12.proxAdj((int) '4');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo10.proxAdj(10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo10.listaAdjVazia((int) '#');
        ds.Grafo grafo14 = grafo10.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo10.primeiroListaAdj(1);
        boolean boolean19 = grafo10.existeAresta((int) ' ', (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo10.proxAdj((int) (short) 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 10, (int) (byte) 100);
        boolean boolean15 = grafo1.existeAresta((int) 'a', 100);
        ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(0, 0);
        ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(35);
        boolean boolean22 = grafo1.listaAdjVazia((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo1 = new ds.Grafo((int) ' ');
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        int int3 = grafo2.numVertices();
        ds.Grafo grafo4 = grafo2.grafoTransposto();
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo2.proxAdj(0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
        boolean boolean16 = grafo1.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(97);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int) (byte) 0, (int) ' ');
        boolean boolean18 = grafo1.existeAresta(32, 32);
        ds.Grafo.Aresta aresta21 = grafo1.retiraAresta(0, (int) (byte) 100);
        ds.Grafo grafo22 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo1.proxAdj(32);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo1.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean14 = grafo1.listaAdjVazia(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        boolean boolean10 = grafo1.listaAdjVazia((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int) (short) 1);
        boolean boolean18 = grafo14.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo14.proxAdj((int) (byte) 1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(0, 100);
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo12.primeiroListaAdj((int) (byte) 10);
        ds.Grafo.Aresta aresta20 = grafo12.proxAdj((int) (short) 10);
        boolean boolean23 = grafo12.existeAresta(32, (int) (short) -1);
        ds.Grafo grafo24 = grafo12.grafoTransposto();
        boolean boolean26 = grafo12.listaAdjVazia((int) '#');
        grafo12.insereAresta(32, (int) (byte) 100, (int) 'a');
        ds.Grafo.Aresta aresta32 = grafo12.primeiroListaAdj(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta34 = grafo12.proxAdj(0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) (byte) 0, (int) (short) 10, (int) (short) -1);
        int int6 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean9 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.imprime();
        int int13 = grafo11.numVertices();
        grafo11.insereAresta((int) (byte) 0, (int) (byte) 100, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo11.proxAdj(0);
    }
}

