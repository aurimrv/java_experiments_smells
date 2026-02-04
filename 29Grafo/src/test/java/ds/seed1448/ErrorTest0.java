package ds.seed1448;

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
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        grafo13.insereAresta((int) (short) 1, 0, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta24 = grafo13.proxAdj(32);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        ds.Grafo grafo16 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(35);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        boolean boolean21 = grafo13.listaAdjVazia(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo13.proxAdj(10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (short) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo((int) '#');
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (short) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        boolean boolean16 = grafo1.existeAresta(0, (int) (byte) 1);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo17.proxAdj((int) (byte) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        grafo1.insereAresta((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        int int18 = grafo1.numVertices();
        ds.Grafo.Aresta aresta20 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean22 = grafo1.listaAdjVazia(10);
        ds.Grafo grafo23 = grafo1.grafoTransposto();
        boolean boolean26 = grafo1.existeAresta((int) (short) 1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta28 = grafo1.proxAdj(10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) '#', (-1), 1);
        int int10 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj(0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta(0, 10);
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 0);
        grafo3.imprime();
        int int10 = grafo3.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo3.proxAdj(0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia(0);
        ds.Grafo grafo7 = grafo4.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) 1);
        ds.Grafo grafo10 = grafo7.grafoTransposto();
        grafo7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo7.proxAdj(32);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        grafo1.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 100);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo13.proxAdj(0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        boolean boolean17 = grafo13.existeAresta(32, 10);
        ds.Grafo grafo18 = grafo13.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta20 = grafo13.proxAdj((int) (short) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        int int17 = grafo1.numVertices();
        boolean boolean19 = grafo1.listaAdjVazia(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj(1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        int int19 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj(32);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        ds.Grafo grafo15 = grafo1.grafoTransposto();
        int int16 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        grafo1.imprime();
        boolean boolean20 = grafo1.existeAresta(32, 0);
        ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(35);
        int int23 = grafo1.numVertices();
        ds.Grafo grafo24 = grafo1.grafoTransposto();
        ds.Grafo grafo25 = grafo24.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta27 = grafo24.proxAdj(0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        boolean boolean21 = grafo13.listaAdjVazia(97);
        grafo13.insereAresta((int) 'a', (int) (byte) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta27 = grafo13.proxAdj(32);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        grafo1.insereAresta((int) 'a', 0, 100);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta(10, 97, (int) ' ');
        grafo1.imprime();
        grafo1.insereAresta(1, (int) 'a', 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta25 = grafo1.proxAdj(0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        grafo1.imprime();
        boolean boolean16 = grafo1.existeAresta(10, 97);
        int int17 = grafo1.numVertices();
        boolean boolean20 = grafo1.existeAresta((int) (byte) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj(32);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        boolean boolean8 = grafo1.existeAresta((int) (byte) 0, (int) (byte) 10);
        boolean boolean10 = grafo1.listaAdjVazia(0);
        ds.Grafo grafo11 = grafo1.grafoTransposto();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        ds.Grafo.Aresta aresta19 = grafo13.primeiroListaAdj((int) (short) 0);
        grafo13.insereAresta(52, 10, (int) (byte) 1);
        boolean boolean26 = grafo13.existeAresta((int) (short) 10, (int) (byte) -1);
        grafo13.insereAresta(10, (int) (byte) 10, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta32 = grafo13.proxAdj((int) (byte) 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        grafo1.insereAresta(1, (int) (short) 10, (int) (byte) 10);
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, 1);
        boolean boolean18 = grafo1.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        grafo19.insereAresta((int) (byte) 10, (int) '4', (int) ' ');
        grafo19.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta26 = grafo19.proxAdj(0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) 'a');
        boolean boolean6 = grafo1.existeAresta(35, (int) (short) -1);
        ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int) (byte) 0);
        boolean boolean11 = grafo1.existeAresta((int) (short) 0, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo1 = new ds.Grafo(100);
        boolean boolean3 = grafo1.listaAdjVazia((int) (byte) 1);
        int int4 = grafo1.numVertices();
        boolean boolean7 = grafo1.existeAresta((int) (byte) 10, (int) (short) 100);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) (short) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        grafo13.imprime();
        ds.Grafo.Aresta aresta17 = grafo13.retiraAresta(0, (int) (short) 10);
        grafo13.imprime();
        boolean boolean21 = grafo13.existeAresta((int) (byte) 1, 97);
        boolean boolean24 = grafo13.existeAresta(0, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta26 = grafo13.proxAdj(0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo1 = new ds.Grafo(100);
        grafo1.insereAresta((int) '#', (int) ' ', (int) ' ');
        grafo1.insereAresta((int) '#', 0, 0);
        boolean boolean12 = grafo1.existeAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo13 = grafo1.grafoTransposto();
        int int14 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) '#');
    }
}

