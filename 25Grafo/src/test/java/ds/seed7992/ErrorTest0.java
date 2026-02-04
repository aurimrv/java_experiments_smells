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
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj(0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        int int6 = grafo3.numVertices();
        boolean boolean8 = grafo3.listaAdjVazia((int) (byte) 10);
        boolean boolean10 = grafo3.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj((int) (short) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) '4', (int) (short) 100);
        grafo3.insereAresta((int) ' ', (int) (byte) 10, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj((int) (short) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (byte) 10, (int) '#', (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        grafo0.insereAresta(10, (int) (short) -1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int) (short) 10);
        boolean boolean7 = grafo3.listaAdjVazia(35);
        grafo3.imprime();
        boolean boolean10 = grafo3.listaAdjVazia(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj((int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(52);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 10);
        boolean boolean7 = grafo0.listaAdjVazia(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.insereAresta(0, (int) 'a', (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int) (short) 10);
        boolean boolean7 = grafo3.listaAdjVazia(35);
        grafo3.imprime();
        boolean boolean10 = grafo3.listaAdjVazia(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj(35);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int) (byte) 1);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        int int9 = grafo8.numVertices();
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo8.proxAdj(35);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta7 = grafo5.proxAdj(52);
        ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(35);
        grafo5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo5.proxAdj(10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta(35, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        boolean boolean10 = grafo0.existeAresta(1, (int) (byte) 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(35);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta(35, (int) (short) 0);
        int int5 = grafo0.numVertices();
        grafo0.insereAresta((int) '4', 97, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.insereAresta((int) 'a', (int) 'a', 52);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo10.proxAdj((int) (short) 10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (byte) 10, (int) '#', (int) '#');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int) (short) 10);
        boolean boolean7 = grafo3.listaAdjVazia(35);
        grafo3.imprime();
        boolean boolean10 = grafo3.listaAdjVazia(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj((int) '#');
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (byte) 0);
        grafo2.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo2.proxAdj((int) '#');
        int int11 = grafo2.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo2.proxAdj((int) '#');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) '4', (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo3.proxAdj((int) (short) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj(97);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(97);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta(35, (int) '4', (int) 'a');
        boolean boolean10 = grafo3.existeAresta(0, 52);
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        boolean boolean13 = grafo3.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo3.proxAdj(35);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta(35, (int) (short) 0);
        grafo0.insereAresta((int) '#', 1, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(32);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        int int8 = grafo0.numVertices();
        int int9 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean12 = grafo0.listaAdjVazia(0);
        boolean boolean14 = grafo0.listaAdjVazia((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(97);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo3.numVertices();
        boolean boolean8 = grafo3.existeAresta(35, (int) ' ');
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj(0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.insereAresta((int) 'a', (int) 'a', 52);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo10.proxAdj((int) (byte) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo3.numVertices();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        int int7 = grafo3.numVertices();
        grafo3.imprime();
        grafo3.insereAresta((int) ' ', (int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo3.proxAdj(1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
        int int8 = grafo0.numVertices();
        int int9 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int) (short) 10);
        boolean boolean7 = grafo3.listaAdjVazia(35);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj((int) (byte) 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        int int6 = grafo5.numVertices();
        boolean boolean8 = grafo5.listaAdjVazia(1);
        boolean boolean11 = grafo5.existeAresta((int) (short) 0, (int) (short) 0);
        boolean boolean13 = grafo5.listaAdjVazia(35);
        int int14 = grafo5.numVertices();
        ds.Grafo.Aresta aresta16 = grafo5.primeiroListaAdj(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo5.proxAdj((int) '#');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.insereAresta(0, (int) 'a', (int) ' ');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        int int8 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.insereAresta((int) 'a', (int) 'a', 52);
        grafo0.imprime();
        boolean boolean11 = grafo0.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, 35);
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 100, (int) (short) -1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta(0, 35, (int) '#');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj(32);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta((int) (byte) 1, (int) (short) 10);
        boolean boolean7 = grafo0.existeAresta((int) (byte) 10, 35);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) (byte) 1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(10);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo12.proxAdj(97);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo2.listaAdjVazia((int) (byte) 0);
        int int5 = grafo2.numVertices();
        ds.Grafo grafo6 = grafo2.grafoTransposto();
        grafo2.insereAresta(32, (int) (short) 100, (int) '#');
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo2.proxAdj((int) '#');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        int int3 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta((int) (byte) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 100, (int) (short) -1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) ' ');
        grafo0.imprime();
        ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj(0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj(52);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        grafo5.imprime();
        grafo5.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo5.proxAdj(0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo3.proxAdj(35);
        int int6 = grafo3.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) '#');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta(35, (int) '4', (int) 'a');
        boolean boolean10 = grafo3.existeAresta(0, 52);
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj((int) (short) 10);
        grafo3.insereAresta((int) (byte) 1, (int) '4', 100);
        grafo3.imprime();
        ds.Grafo.Aresta aresta20 = grafo3.primeiroListaAdj(0);
        ds.Grafo grafo21 = grafo3.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo23 = grafo3.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo3.proxAdj((int) '#');
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 100, (int) (short) -1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj(97);
        boolean boolean17 = grafo0.listaAdjVazia((int) (byte) 10);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj(32);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean5 = grafo0.existeAresta(0, (int) ' ');
        ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.insereAresta((int) (byte) 10, (int) '#', (int) '#');
        boolean boolean13 = grafo0.listaAdjVazia((int) '#');
        grafo0.insereAresta((int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int) '4');
        int int20 = grafo0.numVertices();
        int int21 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo3.grafoTransposto();
        int int5 = grafo3.numVertices();
        ds.Grafo grafo6 = grafo3.grafoTransposto();
        boolean boolean8 = grafo3.listaAdjVazia(52);
        ds.Grafo.Aresta aresta10 = grafo3.primeiroListaAdj((int) 'a');
        int int11 = grafo3.numVertices();
        grafo3.insereAresta((int) (byte) 10, (int) ' ', (int) (short) 0);
        boolean boolean18 = grafo3.existeAresta(32, (int) (byte) 1);
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo3.proxAdj((int) ' ');
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, 0, 0);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 10, (int) (byte) -1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.existeAresta((int) '4', 52);
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 1);
        boolean boolean9 = grafo0.existeAresta((int) (short) 1, (int) (short) 0);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.insereAresta(52, (int) (short) 1, 35);
        int int16 = grafo0.numVertices();
        int int17 = grafo0.numVertices();
        boolean boolean19 = grafo0.listaAdjVazia(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int) (short) 1);
    }
}

