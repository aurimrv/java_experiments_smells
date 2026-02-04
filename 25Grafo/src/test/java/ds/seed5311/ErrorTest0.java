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
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        grafo0.insereAresta((int) 'a', (int) (short) 100, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo2.proxAdj((int) (short) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        grafo0.insereAresta((int) '4', (-1), 10);
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        int int13 = grafo0.numVertices();
        grafo0.insereAresta(1, (int) ' ', (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo4.proxAdj(35);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) (byte) 1);
        ds.Grafo grafo5 = grafo2.grafoTransposto();
        grafo5.imprime();
        boolean boolean9 = grafo5.existeAresta(1, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo5.proxAdj(35);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta4 = grafo2.primeiroListaAdj((int) (byte) 1);
        boolean boolean6 = grafo2.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo2.proxAdj((int) 'a');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int6 = grafo0.numVertices();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        grafo0.imprime();
        boolean boolean11 = grafo0.existeAresta((int) 'a', (int) (byte) 10);
        int int12 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        grafo0.insereAresta((int) 'a', (int) (short) 100, (int) (short) 0);
        int int12 = grafo0.numVertices();
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(1);
        boolean boolean16 = grafo0.listaAdjVazia((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
        grafo0.imprime();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) (short) 10);
        boolean boolean12 = grafo6.listaAdjVazia(0);
        ds.Grafo.Aresta aresta14 = grafo6.proxAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo6.proxAdj((int) '4');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        int int7 = grafo0.numVertices();
        grafo0.insereAresta((int) '4', (-1), (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 0);
        boolean boolean10 = grafo6.listaAdjVazia(97);
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo6.proxAdj((int) (short) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        grafo0.insereAresta((int) 'a', (int) (short) 100, (int) (short) 0);
        int int12 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 1, (int) (short) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(97);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.existeAresta((int) (short) 10, (int) (short) 10);
        boolean boolean8 = grafo0.existeAresta((int) (short) 0, 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.imprime();
        ds.Grafo grafo11 = grafo9.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo9.proxAdj((int) (short) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        grafo0.insereAresta((int) 'a', (int) (short) 100, (int) (short) 0);
        int int12 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(97);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(97);
        grafo0.insereAresta(1, (int) (byte) 10, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int6 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        grafo0.imprime();
        boolean boolean7 = grafo0.existeAresta((int) ' ', (-1));
        grafo0.insereAresta((int) (byte) 10, 100, (int) '#');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) (short) 10);
        grafo6.imprime();
        int int12 = grafo6.numVertices();
        grafo6.insereAresta(32, 0, (int) '4');
        int int17 = grafo6.numVertices();
        ds.Grafo.Aresta aresta19 = grafo6.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo6.proxAdj((int) (byte) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(52);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(97);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(97);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 100, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        int int6 = grafo0.numVertices();
        boolean boolean9 = grafo0.existeAresta((int) (byte) 1, (int) (byte) -1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(97);
        boolean boolean8 = grafo0.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(97, (int) (byte) 10);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        int int10 = grafo0.numVertices();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo4.proxAdj((int) (short) 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        grafo0.insereAresta((int) '4', (-1), 10);
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        int int13 = grafo0.numVertices();
        int int14 = grafo0.numVertices();
        boolean boolean16 = grafo0.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta((int) '4', 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        int int5 = grafo4.numVertices();
        grafo4.imprime();
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo4.proxAdj(35);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(97);
        int int7 = grafo0.numVertices();
        grafo0.insereAresta((int) '4', (int) '#', (int) (short) 100);
        int int12 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int6 = grafo0.numVertices();
        boolean boolean9 = grafo0.existeAresta((int) '#', (int) (short) 100);
        int int10 = grafo0.numVertices();
        int int11 = grafo0.numVertices();
        boolean boolean14 = grafo0.existeAresta((int) '#', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        boolean boolean9 = grafo0.existeAresta(1, 97);
        int int10 = grafo0.numVertices();
        grafo0.insereAresta((int) (short) 1, 10, 0);
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(97);
        int int17 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia(10);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) 'a');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(52);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        boolean boolean7 = grafo4.listaAdjVazia((int) (short) 10);
        boolean boolean10 = grafo4.existeAresta(1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo4.proxAdj((int) (short) 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.imprime();
        int int5 = grafo0.numVertices();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo6.primeiroListaAdj((int) (short) 10);
        boolean boolean12 = grafo6.listaAdjVazia(0);
        int int13 = grafo6.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo6.proxAdj((int) (byte) 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 0);
        int int6 = grafo0.numVertices();
        boolean boolean9 = grafo0.existeAresta((int) '#', (int) (short) 100);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(10);
        boolean boolean14 = grafo0.existeAresta(97, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo2.imprime();
        boolean boolean5 = grafo2.listaAdjVazia((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo2.proxAdj((int) '#');
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean7 = grafo0.listaAdjVazia(97);
        int int8 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean11 = grafo0.listaAdjVazia((int) ' ');
        boolean boolean14 = grafo0.existeAresta(0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        grafo0.insereAresta((int) '#', (int) 'a', (int) 'a');
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        boolean boolean11 = grafo0.listaAdjVazia(97);
        grafo0.insereAresta((int) (byte) 1, (int) ' ', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo0.proxAdj(0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia(0);
        grafo0.insereAresta(0, (int) (byte) 1, (int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        int int11 = grafo0.numVertices();
        ds.Grafo.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(32);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        int int4 = grafo0.numVertices();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(97);
        grafo0.insereAresta(1, (int) (byte) 10, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        boolean boolean6 = grafo0.existeAresta((int) (byte) 0, (int) '4');
        int int7 = grafo0.numVertices();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 10);
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, (int) (short) 100);
        boolean boolean14 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo0.existeAresta((int) '#', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo0.existeAresta((int) '#', (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(52);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int) (short) 0);
        boolean boolean13 = grafo9.listaAdjVazia(0);
        grafo9.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo9.proxAdj(35);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.listaAdjVazia((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean4 = grafo0.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
    }
}

