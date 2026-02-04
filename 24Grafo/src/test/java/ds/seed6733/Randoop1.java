package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        grafo3.insereAresta((int) (byte) 0, (int) (short) 1, 0);
        ds.Aresta aresta10 = grafo3.retiraAresta((int) (short) 1, (int) (short) 1);
        grafo3.imprime();
        boolean boolean14 = grafo3.existeAresta(0, (int) ' ');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta7 = grafo1.retiraAresta((int) 'a', (int) (short) 1);
        ds.Aresta aresta10 = grafo1.retiraAresta(10, 10);
        grafo1.insereAresta((int) (byte) 0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta(0, (int) '4');
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (byte) 1);
        ds.Aresta aresta11 = grafo1.proxAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        boolean boolean4 = grafo0.listaAdjVazia((int) (short) 10);
        boolean boolean7 = grafo0.existeAresta((int) (short) 10, 0);
        grafo0.insereAresta((int) (short) 0, (int) (short) 10, 0);
        ds.Aresta aresta13 = grafo0.proxAdj((int) ' ');
        ds.Aresta aresta16 = grafo0.retiraAresta(10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 100, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 1, (int) '4');
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        grafo5.insereAresta((int) (short) 10, (int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Grafo grafo13 = grafo5.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        boolean boolean16 = grafo14.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        boolean boolean12 = grafo1.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        boolean boolean19 = grafo17.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.existeAresta((int) ' ', 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta12 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta15 = grafo0.retiraAresta((int) (byte) 1, (int) (byte) 1);
        grafo0.insereAresta((int) ' ', 0, (int) '#');
        ds.Grafo grafo20 = grafo0.grafoTransposto();
        ds.Aresta aresta23 = grafo0.retiraAresta((int) (short) 10, 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo10.retiraAresta((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 1);
        grafo0.insereAresta((int) (byte) 10, (int) (short) 10, (int) (short) -1);
        grafo0.insereAresta(0, (int) ' ', 1);
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, (int) ' ');
        ds.Aresta aresta12 = grafo7.primeiroListaAdj((int) (short) 10);
        grafo7.imprime();
        ds.Grafo grafo14 = grafo7.grafoTransposto();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        grafo5.imprime();
        ds.Grafo grafo14 = grafo5.grafoTransposto();
        ds.Aresta aresta16 = grafo5.proxAdj((int) ' ');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta13 = grafo1.retiraAresta((int) (short) 0, 0);
        ds.Aresta aresta16 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        boolean boolean18 = grafo1.listaAdjVazia((int) (byte) 1);
        grafo1.insereAresta(0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo7.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo13.insereAresta((int) (byte) 1, 10, (int) (byte) -1);
        boolean boolean20 = grafo13.existeAresta((int) (byte) 10, 10);
        boolean boolean23 = grafo13.existeAresta(1, (int) (short) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        boolean boolean14 = grafo5.existeAresta((int) (byte) 10, 0);
        ds.Grafo grafo15 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo15.insereAresta((int) (byte) 1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.imprime();
        ds.Aresta aresta10 = grafo7.proxAdj((int) '4');
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta9 = grafo5.proxAdj((int) (byte) 1);
        ds.Aresta aresta12 = grafo5.retiraAresta(0, (int) (byte) 0);
        boolean boolean14 = grafo5.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', (int) (short) 1, (int) (byte) -1);
        grafo0.imprime();
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Aresta aresta3 = grafo0.proxAdj(10);
        ds.Aresta aresta5 = grafo0.proxAdj((int) (short) 1);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta6 = grafo0.proxAdj(1);
        boolean boolean8 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta(0, (int) '4');
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean11 = grafo1.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (short) 10, (int) '#');
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 10);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        grafo0.imprime();
        grafo0.insereAresta((int) ' ', (int) 'a', (int) (short) -1);
        boolean boolean9 = grafo0.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta12 = grafo0.retiraAresta((int) ' ', (int) (short) 0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.imprime();
        boolean boolean12 = grafo1.existeAresta((int) '4', 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta16 = grafo1.primeiroListaAdj((int) (byte) 10);
        grafo1.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta((int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 1);
        grafo0.insereAresta((int) (byte) 10, (int) (short) 10, (int) (short) -1);
        grafo0.insereAresta(0, (int) ' ', 1);
        grafo0.imprime();
        boolean boolean14 = grafo0.existeAresta((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        ds.Grafo grafo15 = grafo14.grafoTransposto();
        grafo15.insereAresta(1, 0, (int) (byte) 10);
        ds.Aresta aresta22 = grafo15.retiraAresta((int) (short) 1, (int) (short) 0);
        boolean boolean25 = grafo15.existeAresta((int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(aresta22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        boolean boolean4 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo5.grafoTransposto();
        grafo5.imprime();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Aresta aresta14 = grafo0.proxAdj((int) 'a');
        boolean boolean16 = grafo0.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo0.existeAresta((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta((int) 'a', 0, 10);
        ds.Grafo grafo8 = grafo3.grafoTransposto();
        grafo3.imprime();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta9 = grafo5.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo5.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean10 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        boolean boolean15 = grafo0.listaAdjVazia((int) '#');
        ds.Aresta aresta18 = grafo0.retiraAresta((int) '#', 0);
        boolean boolean21 = grafo0.existeAresta((int) 'a', 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Aresta aresta14 = grafo12.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta16 = grafo12.proxAdj((int) 'a');
        ds.Aresta aresta18 = grafo12.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        ds.Aresta aresta6 = grafo1.retiraAresta(1, (int) '#');
        boolean boolean8 = grafo1.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean10 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Aresta aresta14 = grafo0.proxAdj((int) (byte) 1);
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo1.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.insereAresta((int) 'a', (int) (short) 10, (int) 'a');
        boolean boolean21 = grafo13.existeAresta((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        grafo5.insereAresta((int) (short) 10, (int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Grafo grafo13 = grafo5.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo13.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) '#');
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Grafo grafo4 = grafo1.grafoTransposto();
        boolean boolean6 = grafo4.listaAdjVazia((int) (short) 10);
        grafo4.insereAresta(0, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo4.retiraAresta((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) (short) 1);
        ds.Aresta aresta9 = grafo0.proxAdj((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (short) 10, (int) '#');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta((int) '#', 1);
        ds.Aresta aresta15 = grafo10.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(aresta15);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, (int) ' ');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean13 = grafo7.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.imprime();
        boolean boolean12 = grafo1.existeAresta((int) '4', 1);
        boolean boolean14 = grafo1.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Aresta aresta10 = grafo0.retiraAresta((int) (byte) 1, (int) (short) 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo11.existeAresta((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (short) 10, (int) '#');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta((int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) 1, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        ds.Grafo grafo15 = grafo13.grafoTransposto();
        java.lang.Class<?> wildcardClass16 = grafo15.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        grafo2.imprime();
        grafo2.imprime();
        grafo2.insereAresta((int) (short) 10, 1, (int) 'a');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.existeAresta((int) (short) 0, 0);
        ds.Aresta aresta8 = grafo0.proxAdj(1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo0.existeAresta((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 0);
        grafo1.insereAresta((int) (short) 10, 0, (int) '4');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta6 = grafo0.retiraAresta((int) 'a', (int) (byte) 1);
        ds.Aresta aresta9 = grafo0.retiraAresta(0, (int) '4');
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo0.grafoTransposto();
        boolean boolean17 = grafo14.existeAresta((int) (short) 10, 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        boolean boolean3 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta5 = grafo0.proxAdj((int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass7 = grafo6.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta13 = grafo1.retiraAresta((int) (short) 0, 0);
        ds.Aresta aresta15 = grafo1.proxAdj((int) '#');
        ds.Aresta aresta17 = grafo1.primeiroListaAdj(0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta9 = grafo5.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo12.insereAresta((int) (byte) 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) (short) 1);
        grafo0.imprime();
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        boolean boolean7 = grafo0.listaAdjVazia((int) 'a');
        ds.Aresta aresta9 = grafo0.proxAdj((int) (byte) 10);
        grafo0.imprime();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        boolean boolean4 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo5.retiraAresta(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        boolean boolean11 = grafo5.listaAdjVazia(10);
        boolean boolean14 = grafo5.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Aresta aresta16 = grafo5.proxAdj(1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(aresta16);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 0, (int) (byte) 0);
        boolean boolean14 = grafo0.existeAresta(1, 0);
        ds.Aresta aresta17 = grafo0.retiraAresta((int) (byte) 0, 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo0.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta16 = grafo0.primeiroListaAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo0.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta(0, (int) '4');
        boolean boolean9 = grafo1.existeAresta((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo1.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (short) 10, (int) '#');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta((int) '#', 1);
        ds.Aresta aresta15 = grafo10.primeiroListaAdj(0);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        boolean boolean10 = grafo0.existeAresta((int) 'a', 0);
        ds.Aresta aresta13 = grafo0.retiraAresta((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo3.insereAresta((int) 'a', 0, 10);
        ds.Aresta aresta9 = grafo3.proxAdj(0);
        java.lang.Class<?> wildcardClass10 = grafo3.getClass();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) ' ', (int) (byte) 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass7 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta(0, (int) '4');
        boolean boolean9 = grafo1.existeAresta((int) (byte) 1, (int) (byte) 1);
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo1.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        ds.Aresta aresta19 = grafo17.proxAdj(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta13 = grafo1.retiraAresta((int) (short) 0, 0);
        ds.Aresta aresta15 = grafo1.proxAdj((int) '#');
        grafo1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo1.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        boolean boolean6 = grafo1.existeAresta(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) -1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (short) 10, (int) (short) 10, (int) '#');
        ds.Aresta aresta11 = grafo0.primeiroListaAdj(1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta6 = grafo1.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo7 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo7.retiraAresta((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta10 = grafo5.retiraAresta(10, (int) (short) 10);
        ds.Aresta aresta12 = grafo5.primeiroListaAdj((int) '#');
        ds.Grafo grafo13 = grafo5.grafoTransposto();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean12 = grafo0.existeAresta(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean12 = grafo0.existeAresta(1, (int) (byte) 1);
        ds.Aresta aresta14 = grafo0.proxAdj(1);
        ds.Aresta aresta16 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean19 = grafo0.existeAresta((int) (short) 1, (int) ' ');
        grafo0.insereAresta(1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo7.insereAresta((int) (short) 10, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta12 = grafo1.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) '#');
        ds.Aresta aresta6 = grafo1.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo1.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.insereAresta(1, (int) (short) 10, (int) '#');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo10.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        grafo5.insereAresta((int) (short) 10, (int) (byte) 10, (int) (byte) 100);
        boolean boolean13 = grafo5.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        ds.Aresta aresta6 = grafo1.retiraAresta(0, (int) 'a');
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) (short) 1);
        grafo1.insereAresta((int) (short) 0, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) ' ', (int) (byte) 1);
        grafo0.imprime();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '#');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo2.insereAresta((int) (byte) 0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.insereAresta((int) (byte) 10, (int) 'a', (-1));
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta13 = grafo1.retiraAresta((int) (short) 0, 0);
        ds.Aresta aresta15 = grafo1.proxAdj((int) '#');
        ds.Aresta aresta18 = grafo1.retiraAresta((int) (byte) 10, (int) (byte) 10);
        ds.Grafo grafo19 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) ' ');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        ds.Aresta aresta7 = grafo0.retiraAresta((int) '4', 0);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj(10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.imprime();
        ds.Grafo grafo16 = grafo13.grafoTransposto();
        ds.Grafo grafo17 = grafo13.grafoTransposto();
        java.lang.Class<?> wildcardClass18 = grafo13.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) (byte) 0);
        boolean boolean10 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        ds.Aresta aresta16 = grafo13.retiraAresta(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Aresta aresta3 = grafo1.proxAdj((int) (byte) 0);
        ds.Aresta aresta6 = grafo1.retiraAresta(0, (int) 'a');
        grafo1.imprime();
        ds.Aresta aresta10 = grafo1.retiraAresta((int) (byte) 0, 10);
        boolean boolean12 = grafo1.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.existeAresta((int) ' ', 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo8.proxAdj(1);
        grafo8.imprime();
        ds.Grafo grafo12 = grafo8.grafoTransposto();
        ds.Aresta aresta14 = grafo12.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        ds.Aresta aresta10 = grafo1.proxAdj(0);
        ds.Aresta aresta13 = grafo1.retiraAresta((int) (short) 0, 0);
        ds.Aresta aresta16 = grafo1.retiraAresta((int) 'a', (int) (byte) 0);
        ds.Grafo grafo17 = grafo1.grafoTransposto();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        ds.Grafo grafo3 = grafo1.grafoTransposto();
        ds.Aresta aresta5 = grafo1.primeiroListaAdj(0);
        java.lang.Class<?> wildcardClass6 = grafo1.getClass();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo9.existeAresta(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = grafo0.existeAresta((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo3.retiraAresta((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        grafo2.imprime();
        grafo2.imprime();
        boolean boolean8 = grafo2.existeAresta((int) ' ', 0);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) ' ');
        grafo0.imprime();
        ds.Aresta aresta10 = grafo0.proxAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Aresta aresta14 = grafo12.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta16 = grafo12.proxAdj((int) (byte) 1);
        ds.Aresta aresta18 = grafo12.proxAdj((int) (short) 0);
        boolean boolean20 = grafo12.listaAdjVazia((int) '#');
        grafo12.imprime();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.existeAresta((int) ' ', 1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia(1);
        boolean boolean13 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean7 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta((int) (short) 10, 0, (int) (byte) 0);
        boolean boolean14 = grafo0.existeAresta(1, 0);
        ds.Aresta aresta17 = grafo0.retiraAresta((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = aresta17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.proxAdj((int) (short) 0);
        ds.Aresta aresta4 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        grafo5.insereAresta((int) (short) 10, (int) (byte) 10, (int) (byte) 100);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        ds.Aresta aresta14 = grafo5.primeiroListaAdj((int) (byte) 1);
        ds.Aresta aresta16 = grafo5.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        boolean boolean4 = grafo0.existeAresta((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 0);
        boolean boolean14 = grafo5.existeAresta((int) (byte) 10, 0);
        boolean boolean17 = grafo5.existeAresta((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 10, (int) 'a');
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean18 = grafo0.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo0.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
        boolean boolean5 = grafo0.existeAresta((int) (byte) 0, 1);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo7.existeAresta(0, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        boolean boolean4 = grafo1.listaAdjVazia((int) (short) 1);
        boolean boolean6 = grafo1.listaAdjVazia(10);
        ds.Aresta aresta8 = grafo1.primeiroListaAdj((int) 'a');
        grafo1.imprime();
        ds.Grafo grafo10 = grafo1.grafoTransposto();
        ds.Aresta aresta13 = grafo1.retiraAresta((int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo1.insereAresta((int) (byte) 1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo5.insereAresta((int) (short) 1, (int) (byte) 0, (int) (short) 100);
        boolean boolean11 = grafo5.listaAdjVazia(10);
        ds.Grafo grafo12 = grafo5.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo12.getClass();
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) '4', (int) (short) 1, (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.insereAresta((int) '4', (int) (byte) 1, (int) (short) 0);
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta16 = grafo0.proxAdj(0);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }
}

