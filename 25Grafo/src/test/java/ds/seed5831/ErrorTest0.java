package ds.seed5831;

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
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(32);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        boolean boolean6 = grafo0.existeAresta(35, (int) (byte) 100);
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(32);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) 'a');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo5.proxAdj((int) (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        int int9 = grafo6.numVertices();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo6.proxAdj((int) (short) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean16 = grafo0.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        grafo7.imprime();
        int int12 = grafo7.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo7.proxAdj((int) '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        int int9 = grafo6.numVertices();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta13 = grafo6.primeiroListaAdj((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo6.proxAdj(10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        grafo0.insereAresta((int) ' ', (int) (short) 0, 35);
        grafo0.insereAresta((int) (byte) 10, (int) (short) 1, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        int int12 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 0, 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 0, (int) '4');
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int) (short) 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        grafo7.imprime();
        ds.Grafo grafo12 = grafo7.grafoTransposto();
        ds.Grafo.Aresta aresta14 = grafo7.primeiroListaAdj(0);
        grafo7.insereAresta((int) (byte) 1, 52, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo7.proxAdj((int) '4');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        grafo7.imprime();
        int int12 = grafo7.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo7.proxAdj((int) ' ');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.insereAresta(52, (int) 'a', 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(97);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(35);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta(35, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 10, (int) '#');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        int int4 = grafo0.numVertices();
        ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) 'a');
        int int13 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.existeAresta((int) (short) 0, (int) (short) 100);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) ' ');
        boolean boolean13 = grafo8.existeAresta(32, 10);
        int int14 = grafo8.numVertices();
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo8.proxAdj(52);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        int int3 = grafo0.numVertices();
        grafo0.insereAresta(10, (int) (byte) 10, (int) '#');
        grafo0.imprime();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 100);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) '#');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        int int4 = grafo0.numVertices();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        int int8 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta(32, 32, (int) 'a');
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(35, 1);
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo7.proxAdj((int) (byte) 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int) (short) 10);
        int int9 = grafo6.numVertices();
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta13 = grafo6.primeiroListaAdj((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo6.proxAdj(52);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        int int9 = grafo6.numVertices();
        boolean boolean11 = grafo6.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo6.proxAdj((int) '4');
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) ' ', (int) '4', (int) (byte) -1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo6.proxAdj((int) (short) 10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo4.proxAdj(1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean14 = grafo0.listaAdjVazia((int) (byte) 1);
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 0);
        boolean boolean10 = grafo0.listaAdjVazia(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean16 = grafo0.listaAdjVazia(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj(1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta(10, (int) (short) 100);
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(35);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        int int10 = grafo0.numVertices();
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 0);
        boolean boolean15 = grafo0.existeAresta((int) ' ', (int) '4');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (byte) 10);
    }
}

