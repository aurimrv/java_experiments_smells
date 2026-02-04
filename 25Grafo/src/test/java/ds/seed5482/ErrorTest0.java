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
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.listaAdjVazia((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo3.proxAdj((int) '4');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.insereAresta(32, 0, (int) '4');
        boolean boolean9 = grafo3.listaAdjVazia(32);
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo3.proxAdj((int) (byte) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta((int) '#', (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) 'a', 0);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int) (byte) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(0);
        ds.Grafo.Aresta aresta7 = grafo2.proxAdj((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj(1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(0);
        grafo2.imprime();
        ds.Grafo grafo7 = grafo2.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo2.proxAdj((int) ' ');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(1);
        grafo0.insereAresta((int) '#', (int) (byte) 0, (int) (short) 10);
        boolean boolean10 = grafo0.existeAresta((int) '4', 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta((int) (short) 10, (int) (byte) 0);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo7.proxAdj((int) (short) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(0);
        grafo2.imprime();
        grafo2.insereAresta((int) '#', (-1), (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo2.proxAdj((int) (short) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 1, 97, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) (short) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.existeAresta((int) ' ', 0);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) '#');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.insereAresta(32, 0, (int) '4');
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        grafo8.imprime();
        int int10 = grafo8.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo8.proxAdj(0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.insereAresta(32, 0, (int) '4');
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo8.proxAdj((int) 'a');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        grafo1.insereAresta(32, 0, 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo1.proxAdj(35);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        boolean boolean7 = grafo4.listaAdjVazia((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo4.proxAdj(32);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        boolean boolean7 = grafo3.existeAresta((int) ' ', 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo3.proxAdj((int) (byte) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int) 'a');
        int int6 = grafo1.numVertices();
        boolean boolean9 = grafo1.existeAresta((int) (short) 0, 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) (byte) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) 'a', 0);
        grafo1.imprime();
        ds.Grafo grafo8 = grafo1.grafoTransposto();
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) '#');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean4 = grafo0.listaAdjVazia((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj(35);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, (int) ' ', 32);
        int int8 = grafo0.numVertices();
        boolean boolean10 = grafo0.listaAdjVazia((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 0, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int) '4');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 1);
        ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj(10);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.insereAresta(32, 0, (int) '4');
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        grafo8.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo8.proxAdj((int) (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo3.insereAresta(32, 0, (int) '4');
        boolean boolean9 = grafo3.listaAdjVazia(32);
        ds.Grafo.Aresta aresta11 = grafo3.primeiroListaAdj(0);
        grafo3.insereAresta((int) '#', 0, (int) (byte) 0);
        ds.Grafo.Aresta aresta17 = grafo3.proxAdj((int) 'a');
        grafo3.insereAresta(10, 97, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo3.proxAdj((int) (byte) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        int int2 = grafo0.numVertices();
        ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int) '4');
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(35);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean7 = grafo1.listaAdjVazia((int) '4');
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo1.proxAdj(32);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean10 = grafo0.existeAresta((int) ' ', 97);
        int int11 = grafo0.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj(35);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.listaAdjVazia((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo3.proxAdj(35);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta(1, (int) (byte) 1);
        int int6 = grafo2.numVertices();
        ds.Grafo.Aresta aresta8 = grafo2.proxAdj((int) '4');
        int int9 = grafo2.numVertices();
        int int10 = grafo2.numVertices();
        ds.Grafo grafo11 = grafo2.grafoTransposto();
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta14 = grafo2.proxAdj((int) (short) 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta((int) (short) 1, (int) (short) 100, (int) '#');
        grafo3.imprime();
        grafo3.insereAresta((int) (byte) 0, (int) (short) 0, 35);
        grafo3.insereAresta((int) ' ', (int) (byte) 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo3.proxAdj((int) '4');
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        boolean boolean7 = grafo3.listaAdjVazia((int) (byte) 1);
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj(52);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) ' ');
        ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int) (byte) 0);
        boolean boolean7 = grafo1.listaAdjVazia((int) '4');
        int int8 = grafo1.numVertices();
        ds.Grafo grafo9 = grafo1.grafoTransposto();
        ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.imprime();
        grafo1.insereAresta((int) (short) 1, (-1), (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta18 = grafo1.proxAdj(0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta((int) (short) 10, (int) (byte) 0);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo11 = grafo8.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int) (short) 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta((int) (short) 10, (int) (byte) 0);
        ds.Grafo grafo7 = grafo3.grafoTransposto();
        grafo3.insereAresta((int) (short) 1, (int) '#', (int) (short) 100);
        grafo3.insereAresta((int) (byte) 1, (int) (short) 1, 0);
        ds.Grafo.Aresta aresta17 = grafo3.proxAdj(97);
        ds.Grafo.Aresta aresta19 = grafo3.proxAdj(35);
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta22 = grafo3.proxAdj((int) 'a');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        int int6 = grafo3.numVertices();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int) (short) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean10 = grafo0.existeAresta((int) ' ', 97);
        boolean boolean13 = grafo0.existeAresta(0, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        boolean boolean6 = grafo3.existeAresta((int) (short) 10, (int) (byte) 0);
        ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo3.proxAdj(32);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj(1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '4');
        grafo0.imprime();
        grafo0.insereAresta(32, (int) (byte) 1, 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int) (short) 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia((int) '4');
        ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta((int) 'a', (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.insereAresta(0, (int) (short) 1, (int) (byte) 100);
        int int7 = grafo0.numVertices();
        boolean boolean10 = grafo0.existeAresta((int) ' ', 100);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int) (byte) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo2.grafoTransposto();
        grafo2.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo2.proxAdj((int) (byte) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.insereAresta((int) (short) 1, (int) ' ', 32);
        int int8 = grafo0.numVertices();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        boolean boolean5 = grafo0.existeAresta(0, (int) (byte) 0);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta12 = grafo0.proxAdj(0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        grafo3.imprime();
        grafo3.insereAresta((int) 'a', 35, (int) (short) 1);
        boolean boolean13 = grafo3.existeAresta((int) (byte) 10, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta15 = grafo3.proxAdj(10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        grafo0.imprime();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo5 = grafo3.grafoTransposto();
        int int6 = grafo3.numVertices();
        grafo3.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta9 = grafo3.proxAdj((int) '#');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int) ' ');
        boolean boolean6 = grafo1.existeAresta((int) 'a', 0);
        grafo1.imprime();
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int) '#');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        ds.Grafo grafo0 = new ds.Grafo();
        int int1 = grafo0.numVertices();
        ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(1);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta7 = grafo0.proxAdj(32);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean3 = grafo0.listaAdjVazia((int) (byte) 1);
        grafo0.imprime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int) (byte) 1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.insereAresta(0, (int) (short) 1, (int) (byte) 100);
        int int7 = grafo0.numVertices();
        boolean boolean10 = grafo0.existeAresta((int) ' ', 100);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean16 = grafo0.existeAresta((int) 'a', (int) (byte) 100);
        grafo0.imprime();
        grafo0.insereAresta(52, (int) ' ', 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta23 = grafo0.proxAdj((int) (byte) 10);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int) (short) 10);
        grafo1.insereAresta(32, 0, 1);
        ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
        boolean boolean12 = grafo1.existeAresta((int) (byte) 10, (int) (short) 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean16 = grafo1.listaAdjVazia(0);
        boolean boolean19 = grafo1.existeAresta((int) (short) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ds.Grafo.Aresta aresta21 = grafo1.proxAdj((int) (short) 10);
    }
}

