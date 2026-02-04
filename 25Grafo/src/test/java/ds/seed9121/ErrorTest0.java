package ds.seed9121;

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
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj(32);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj(32);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) 'a');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj(32);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        int int7 = grafo0.numVertices();
        grafo0.insereAresta(0, 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.retiraAresta(0, 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '#', 10, 1);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj(0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.proxAdj(32);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(97);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        boolean boolean5 = grafo1.listaAdjVazia(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (short) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '#', 10, 1);
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo.Aresta aresta8 = grafo0.retiraAresta(0, 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(52);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) '#');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (short) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        int int7 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean10 = grafo0.existeAresta((int) '4', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Grafo grafo8 = grafo6.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo6.proxAdj((int) (short) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        boolean boolean7 = grafo0.existeAresta(10, (-1));
        int int8 = grafo0.numVertices();
        boolean boolean11 = grafo0.existeAresta(1, (int) (byte) 100);
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', 32, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(32);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        int int5 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean10 = grafo0.existeAresta((int) '4', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj(52);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        boolean boolean7 = grafo0.existeAresta(10, (-1));
        int int8 = grafo0.numVertices();
        boolean boolean11 = grafo0.existeAresta(1, (int) (byte) 100);
        grafo0.imprime();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo0.proxAdj(0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(0, (int) '4', (int) (byte) 100);
        grafo0.insereAresta((int) 'a', (int) '4', 100);
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj(97);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '#', 10, 1);
        grafo0.insereAresta((int) '#', 32, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '#', 10, 1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '4', (int) (short) 100, (int) (byte) 0);
        boolean boolean18 = grafo0.listaAdjVazia(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo0.proxAdj(32);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta(0, (int) 'a', (int) (byte) 0);
        grafo0.imprime();
        grafo0.insereAresta(1, (-1), (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '#', 10, 1);
        grafo0.imprime();
        ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj(97);
        int int13 = grafo0.numVertices();
        int int14 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int) ' ');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo1.existeAresta((int) (short) 0, 0);
        grafo1.imprime();
        int int6 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) 'a');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) 'a');
        int int6 = grafo0.numVertices();
        int int7 = grafo0.numVertices();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (byte) 0);
    }
}

