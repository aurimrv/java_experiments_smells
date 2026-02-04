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
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        grafo1.insereAresta((int) (byte) 1, (int) '#', (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta19 = grafo1.proxAdj(0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.imprime();
        int int8 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int) ' ');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo7.proxAdj((int) (short) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo1.proxAdj(10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo grafo12 = grafo1.grafoTransposto();
        int int13 = grafo1.numVertices();
        boolean boolean16 = grafo1.existeAresta((int) (byte) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(32);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo1.insereAresta(0, (int) (short) -1, (int) (short) 100);
        grafo1.imprime();
        int int12 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int) (short) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) (short) 0, (int) (byte) -1, 52);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(35);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        grafo6.imprime();
        ds.Grafo.Aresta aresta9 = grafo6.primeiroListaAdj((int) ' ');
        ds.Grafo grafo10 = grafo6.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo6.proxAdj(0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo1 = new ds.Grafo(100);
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) (byte) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj(32);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        boolean boolean4 = grafo1.existeAresta((int) (short) 1, 0);
        ds.Grafo grafo5 = grafo1.grafoTransposto();
        grafo1.imprime();
        boolean boolean9 = grafo1.existeAresta((int) (short) 0, (int) (byte) -1);
        grafo1.insereAresta((int) (short) 10, (int) (short) 0, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo1.proxAdj(32);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        boolean boolean14 = grafo7.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo7.proxAdj((int) '4');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.imprime();
        boolean boolean18 = grafo14.existeAresta(0, (int) '#');
        boolean boolean20 = grafo14.listaAdjVazia(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo14.proxAdj((int) (short) 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta(1, 1);
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
        grafo1.insereAresta((int) (short) 0, (int) (byte) -1, 52);
        grafo1.imprime();
        int int17 = grafo1.numVertices();
        boolean boolean20 = grafo1.existeAresta(35, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int) (short) 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        grafo7.imprime();
        boolean boolean12 = grafo7.existeAresta(0, (int) (byte) 0);
        boolean boolean14 = grafo7.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo7.proxAdj(0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        int int4 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.imprime();
        grafo1.imprime();
        int int4 = grafo1.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        int int6 = grafo1.numVertices();
        ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int) (short) 0, (int) (short) 0);
        grafo1.imprime();
        grafo1.imprime();
        int int12 = grafo1.numVertices();
        ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj(35);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 1);
        int int2 = grafo1.numVertices();
        grafo1.imprime();
        grafo1.insereAresta(0, (int) '4', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj(0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo6.imprime();
        boolean boolean11 = grafo6.existeAresta((int) (byte) 0, (int) (short) 1);
        ds.Grafo grafo12 = grafo6.grafoTransposto();
        int int13 = grafo6.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo6.proxAdj((int) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        grafo14.imprime();
        boolean boolean18 = grafo14.existeAresta(0, (int) '#');
        boolean boolean20 = grafo14.listaAdjVazia(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo14.proxAdj(1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        grafo1.insereAresta(0, (int) (short) 1, (int) 'a');
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo14 = grafo1.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia((int) (short) 10);
        grafo14.imprime();
        ds.Grafo grafo18 = grafo14.grafoTransposto();
        ds.Grafo grafo19 = grafo14.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo14.proxAdj((int) (byte) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo6.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo6.proxAdj(10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        boolean boolean8 = grafo1.existeAresta((int) (byte) 10, (int) (byte) 1);
        boolean boolean11 = grafo1.existeAresta((int) ' ', (int) '4');
        grafo1.imprime();
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo1 = new ds.Grafo((int) (byte) 10);
        grafo1.imprime();
        grafo1.imprime();
        grafo1.insereAresta(1, 35, 100);
        boolean boolean10 = grafo1.existeAresta((int) (short) 1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo1.proxAdj(0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo1 = new ds.Grafo((int) (short) 100);
        grafo1.imprime();
        grafo1.imprime();
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo1.proxAdj(97);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo1 = new ds.Grafo((int) 'a');
        grafo1.insereAresta(0, 1, (int) (short) -1);
        ds.Grafo grafo6 = grafo1.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        boolean boolean10 = grafo7.listaAdjVazia((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int) (byte) 10);
    }
}

