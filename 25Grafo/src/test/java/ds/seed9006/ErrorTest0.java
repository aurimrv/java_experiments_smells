package ds.seed9006;

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
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean11 = grafo4.listaAdjVazia(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo4.proxAdj((int) '4');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        grafo8.imprime();
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo8.proxAdj(35);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean11 = grafo4.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo4.proxAdj(32);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(97);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        grafo10.imprime();
        int int14 = grafo10.numVertices();
        int int15 = grafo10.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo10.proxAdj((int) ' ');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        grafo10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo10.proxAdj(0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(32);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        grafo7.imprime();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo7.proxAdj(10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        grafo0.imprime();
        boolean boolean12 = grafo0.listaAdjVazia(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(35);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo4.proxAdj(97);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        int int13 = grafo12.numVertices();
        ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo12.proxAdj(32);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        grafo4.imprime();
        grafo4.insereAresta((int) '4', (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo4.proxAdj(10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        grafo8.imprime();
        ds.Grafo.Aresta aresta16 = grafo8.primeiroListaAdj(35);
        ds.Grafo grafo17 = grafo8.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo8.proxAdj((int) ' ');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        boolean boolean13 = grafo8.existeAresta(0, (int) '#');
        boolean boolean15 = grafo8.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo16 = grafo8.grafoTransposto();
        ds.Grafo grafo17 = grafo16.grafoTransposto();
        int int18 = grafo17.numVertices();
        int int19 = grafo17.numVertices();
        grafo17.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo17.proxAdj(0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        boolean boolean19 = grafo0.existeAresta(10, (int) (byte) 100);
        grafo0.insereAresta((int) (byte) 10, 32, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo0.proxAdj(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta9 = grafo6.primeiroListaAdj(10);
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo6.proxAdj((int) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        int int10 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        boolean boolean18 = grafo0.existeAresta(1, 100);
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        grafo0.insereAresta((int) '4', (int) ' ', 1);
        grafo0.insereAresta((int) (byte) 1, 100, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta31 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        boolean boolean9 = grafo4.listaAdjVazia(10);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        int int11 = grafo10.numVertices();
        grafo10.imprime();
        boolean boolean14 = grafo10.listaAdjVazia(10);
        grafo10.imprime();
        grafo10.insereAresta((int) '4', (int) (byte) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo10.proxAdj((int) (byte) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo4.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo6.proxAdj((int) '#');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        grafo12.imprime();
        boolean boolean15 = grafo12.listaAdjVazia((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo12.proxAdj((int) (short) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean11 = grafo4.listaAdjVazia(10);
        boolean boolean14 = grafo4.existeAresta((int) (short) 1, (int) (short) 10);
        boolean boolean17 = grafo4.existeAresta(1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo4.proxAdj((int) ' ');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        grafo12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int) (byte) 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj(32);
        boolean boolean18 = grafo0.existeAresta(1, 100);
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) 'a');
        boolean boolean22 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta24 = grafo0.primeiroListaAdj((int) (short) 1);
        boolean boolean27 = grafo0.existeAresta(0, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta29 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta(35, 100, (int) ' ');
        grafo3.imprime();
        grafo3.insereAresta(35, (int) '#', (int) (byte) 10);
        int int13 = grafo3.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo3.proxAdj(1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int) (short) 10, (int) (byte) 0);
        boolean boolean14 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj(10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta(1, (int) ' ');
        grafo0.imprime();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta18 = grafo0.retiraAresta((int) (byte) 10, 1);
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        boolean boolean22 = grafo0.existeAresta(97, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta9 = grafo4.primeiroListaAdj(0);
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo4.proxAdj(1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        grafo0.insereAresta(10, 1, (int) (short) 1);
        int int8 = grafo0.numVertices();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int) (short) 10, (int) (byte) 0);
        boolean boolean14 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj(0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (short) 1, (int) (byte) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (byte) 1);
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        grafo4.imprime();
        grafo4.imprime();
        grafo4.insereAresta((int) '4', (int) (short) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo4.proxAdj((int) (short) 1);
    }
}

