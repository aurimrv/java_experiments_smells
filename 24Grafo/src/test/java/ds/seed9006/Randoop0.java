package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 100, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 10, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Grafo grafo0 = new ds.Grafo();
        java.lang.Class<?> wildcardClass1 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass4 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass4 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo0.existeAresta((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.existeAresta((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo0.existeAresta((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = grafo0.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.existeAresta((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        java.lang.Class<?> wildcardClass3 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo0.existeAresta((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo0.existeAresta((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.retiraAresta((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo10.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo0.existeAresta((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = aresta8.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass2 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        boolean boolean12 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo0.existeAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo0.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo3.existeAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.retiraAresta((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo0.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo0.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo0.retiraAresta((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Aresta aresta13 = grafo10.retiraAresta((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo0.retiraAresta((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo8.retiraAresta((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo3.retiraAresta((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (short) 10, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo9.existeAresta((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) 100, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo10.existeAresta(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        java.lang.Class<?> wildcardClass7 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        boolean boolean12 = grafo0.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass13 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo10.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = aresta4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) 10, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo0.retiraAresta((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo8.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo3.retiraAresta(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo8.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass6 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo12.insereAresta(100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) '4', (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo3.existeAresta((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo4.retiraAresta(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo12.existeAresta((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo3.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo3.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta(10, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        java.lang.Class<?> wildcardClass6 = grafo4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo0.retiraAresta(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo4.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.retiraAresta((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo10.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        boolean boolean12 = grafo3.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((-1), (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo3.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo3.existeAresta((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.insereAresta((int) '#', (int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo12.existeAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo9.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        boolean boolean12 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo0.retiraAresta(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass3 = grafo2.getClass();
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass4 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        ds.Aresta aresta11 = grafo3.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) 100, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = grafo3.existeAresta((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) 100, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo3.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        java.lang.Class<?> wildcardClass13 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 1, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo0.existeAresta((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) '4', (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass15 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo10.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 1, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo3.retiraAresta((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.existeAresta(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo15.existeAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta((int) (byte) 1, (int) '4');
        ds.Aresta aresta14 = grafo3.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta((int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass13 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo9.existeAresta((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo3.existeAresta((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.existeAresta((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo0.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(0);
        grafo3.insereAresta(10, 0, 1);
        java.lang.Class<?> wildcardClass13 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = aresta17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass9 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        ds.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        grafo10.imprime();
        java.lang.Class<?> wildcardClass12 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean9 = grafo0.existeAresta((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo3.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        java.lang.Class<?> wildcardClass18 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        boolean boolean9 = grafo0.existeAresta((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (short) 0, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        grafo3.imprime();
        ds.Aresta aresta13 = grafo3.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo3.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo3.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Aresta aresta4 = grafo0.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo0.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo11.insereAresta((int) (byte) 100, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo3.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        grafo0.insereAresta((int) ' ', 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo0.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Aresta aresta4 = grafo0.primeiroListaAdj((int) '4');
        java.lang.Class<?> wildcardClass5 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = aresta10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) '4');
        ds.Aresta aresta14 = grafo0.proxAdj((int) (byte) 1);
        ds.Aresta aresta16 = grafo0.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.insereAresta((int) '#', (int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo3.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.insereAresta((int) (short) 0, (int) '4', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo0.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Aresta aresta11 = grafo8.primeiroListaAdj((int) (byte) 0);
        ds.Aresta aresta13 = grafo8.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo15.retiraAresta((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.retiraAresta((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        boolean boolean12 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.proxAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo0.existeAresta(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo11.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        boolean boolean14 = grafo0.listaAdjVazia((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo11.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = aresta12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) '4', (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.retiraAresta(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        boolean boolean14 = grafo11.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo15 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo15.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Aresta aresta16 = grafo0.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        grafo11.insereAresta(0, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        ds.Aresta aresta16 = grafo10.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo10.retiraAresta((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.retiraAresta((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo3.existeAresta((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta11 = grafo3.retiraAresta(0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta((int) (short) 0, (int) ' ', (int) (short) 0);
        grafo0.insereAresta((int) ' ', (int) (byte) 10, 100);
        boolean boolean17 = grafo0.existeAresta((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        ds.Aresta aresta20 = grafo0.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = grafo0.existeAresta((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 10, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) ' ', (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        grafo0.insereAresta((int) (short) 0, (int) '4', (int) (short) 10);
        ds.Aresta aresta19 = grafo0.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) 'a', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = aresta14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo0.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo12.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo2.retiraAresta(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        boolean boolean19 = grafo15.listaAdjVazia((int) (byte) 10);
        grafo15.imprime();
        java.lang.Class<?> wildcardClass21 = grafo15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        ds.Grafo grafo20 = grafo3.grafoTransposto();
        ds.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta26 = grafo20.retiraAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Aresta aresta16 = grafo0.retiraAresta(0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo10.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo11.insereAresta((int) (short) 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        ds.Aresta aresta20 = grafo0.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo10.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo10.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo3.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        grafo0.insereAresta((int) ' ', 10, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo11.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        ds.Aresta aresta13 = grafo3.retiraAresta((int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo3.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo13.insereAresta((int) (short) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo3.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta2 = grafo0.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Aresta aresta15 = grafo0.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        grafo0.imprime();
        grafo0.imprime();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        grafo3.imprime();
        grafo3.insereAresta((int) (byte) 1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo3.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo9.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo7.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo11.insereAresta((int) 'a', (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo11.existeAresta(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo11.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean5 = grafo2.existeAresta((int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo2.existeAresta(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        java.lang.Class<?> wildcardClass13 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo0.retiraAresta((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo3.imprime();
        ds.Aresta aresta12 = grafo3.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        java.lang.Class<?> wildcardClass11 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) -1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta21 = grafo0.retiraAresta((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        boolean boolean12 = grafo0.existeAresta((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo3.retiraAresta((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        grafo3.imprime();
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        grafo3.imprime();
        ds.Aresta aresta13 = grafo3.primeiroListaAdj((int) (short) 0);
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = aresta11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj(1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        boolean boolean14 = grafo0.listaAdjVazia((int) 'a');
        boolean boolean16 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo0.retiraAresta((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo3.retiraAresta((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo5.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo3.retiraAresta((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        ds.Aresta aresta9 = grafo0.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.insereAresta((int) '#', (int) (short) 10, (int) (short) 100);
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo10.existeAresta((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        boolean boolean19 = grafo15.listaAdjVazia((int) (byte) 10);
        grafo15.imprime();
        boolean boolean23 = grafo15.existeAresta((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        boolean boolean16 = grafo10.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo0.retiraAresta(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.proxAdj(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        grafo0.imprime();
        grafo0.insereAresta(1, (int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) 100, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo0.retiraAresta((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo0.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        ds.Aresta aresta20 = grafo0.primeiroListaAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta23 = grafo0.retiraAresta((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        boolean boolean11 = grafo8.listaAdjVazia((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.insereAresta((int) '#', (int) (short) 10, (int) (short) 100);
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo10.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        grafo0.insereAresta((int) ' ', 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo0.proxAdj(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        java.lang.Class<?> wildcardClass19 = grafo18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        ds.Grafo grafo20 = grafo3.grafoTransposto();
        ds.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = grafo20.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo12.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.insereAresta((int) 'a', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo9.retiraAresta(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo10.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (short) 0);
        ds.Aresta aresta16 = grafo12.proxAdj((int) '4');
        java.lang.Class<?> wildcardClass17 = grafo12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        ds.Aresta aresta19 = grafo9.proxAdj((int) 'a');
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        grafo20.imprime();
        grafo20.insereAresta(10, 0, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        ds.Aresta aresta16 = grafo10.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo10.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        ds.Grafo grafo20 = grafo3.grafoTransposto();
        java.lang.Class<?> wildcardClass21 = grafo20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo3.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        grafo9.imprime();
        grafo9.insereAresta((int) (byte) 1, (int) (byte) 1, 0);
        boolean boolean17 = grafo9.existeAresta((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        ds.Aresta aresta11 = grafo0.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        grafo10.imprime();
        boolean boolean14 = grafo10.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        ds.Aresta aresta17 = grafo15.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo11.insereAresta((int) 'a', (int) (short) 1, (int) '#');
        grafo11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo11.insereAresta((int) (short) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta(100, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(10);
        grafo12.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        ds.Aresta aresta19 = grafo9.proxAdj((int) 'a');
        boolean boolean21 = grafo9.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.insereAresta((int) 'a', 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo0.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        ds.Aresta aresta7 = grafo4.primeiroListaAdj(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = aresta7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        ds.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo3.proxAdj((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo10.listaAdjVazia((int) ' ');
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean12 = grafo0.existeAresta(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = grafo0.existeAresta((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((-1), (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        boolean boolean18 = grafo9.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.existeAresta((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        grafo3.insereAresta(0, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (byte) -1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        boolean boolean14 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo0.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        ds.Aresta aresta13 = grafo11.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (short) 100, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        ds.Aresta aresta10 = grafo3.primeiroListaAdj((int) (short) 10);
        boolean boolean13 = grafo3.existeAresta(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean12 = grafo0.existeAresta((int) '4', (int) (short) 0);
        boolean boolean15 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        ds.Grafo grafo20 = grafo3.grafoTransposto();
        ds.Aresta aresta22 = grafo3.primeiroListaAdj((int) (short) 1);
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo0.insereAresta(0, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (short) 10, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) ' ', (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Aresta aresta14 = grafo0.retiraAresta((int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo0.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj(1);
        ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (byte) 1);
        ds.Aresta aresta15 = grafo0.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(aresta15);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta20 = grafo15.retiraAresta((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Aresta aresta4 = grafo0.proxAdj(10);
        boolean boolean6 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta8 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo0.retiraAresta((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        ds.Grafo grafo16 = grafo9.grafoTransposto();
        java.lang.Class<?> wildcardClass17 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.proxAdj(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo11.insereAresta((int) 'a', (int) (short) 1, (int) '#');
        grafo11.imprime();
        ds.Grafo grafo17 = grafo11.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo9.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(0);
        boolean boolean11 = grafo0.listaAdjVazia(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Aresta aresta13 = grafo0.retiraAresta(0, 0);
        grafo0.insereAresta(1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Aresta aresta15 = grafo0.proxAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Aresta aresta11 = grafo3.proxAdj((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) 'a', 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        ds.Aresta aresta11 = grafo8.primeiroListaAdj((int) (byte) 0);
        boolean boolean14 = grafo8.existeAresta((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia(0);
        boolean boolean7 = grafo0.existeAresta(10, 10);
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        grafo0.imprime();
        grafo0.insereAresta((int) (short) 1, (int) (byte) 0, (-1));
        boolean boolean12 = grafo0.existeAresta(1, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        grafo9.insereAresta(1, 0, (int) (short) 10);
        boolean boolean17 = grafo9.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Aresta aresta13 = grafo10.primeiroListaAdj((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = grafo10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia(10);
        ds.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) ' ', (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo0.retiraAresta((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 1, (int) (short) 0);
        ds.Aresta aresta16 = grafo0.proxAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia((int) '#');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo8.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo7.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        grafo14.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        ds.Aresta aresta13 = grafo3.retiraAresta((int) (byte) 10, (int) (short) 10);
        ds.Grafo grafo14 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo14.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        ds.Aresta aresta10 = grafo0.retiraAresta(1, (int) (short) 0);
        boolean boolean13 = grafo0.existeAresta((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) '4', (int) (short) 1, 1);
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) 'a');
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta15 = grafo0.retiraAresta(1, (int) (byte) 1);
        boolean boolean17 = grafo0.listaAdjVazia(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta15 = grafo0.retiraAresta(1, (int) (byte) 1);
        boolean boolean17 = grafo0.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        grafo10.imprime();
        boolean boolean14 = grafo10.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) 'a');
        ds.Aresta aresta14 = grafo10.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.retiraAresta((int) 'a', (int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta21 = grafo0.retiraAresta((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo9.insereAresta((int) '#', (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Aresta aresta13 = grafo0.retiraAresta(0, 0);
        grafo0.insereAresta(1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Aresta aresta17 = grafo0.proxAdj((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.insereAresta(10, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        ds.Grafo grafo14 = grafo3.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 1);
        ds.Aresta aresta16 = grafo12.proxAdj((int) (short) 0);
        ds.Aresta aresta18 = grafo12.proxAdj((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta20 = grafo12.proxAdj(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        grafo3.imprime();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Aresta aresta12 = grafo3.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) ' ', 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = grafo0.existeAresta(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo3.imprime();
        boolean boolean12 = grafo3.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        grafo3.imprime();
        ds.Aresta aresta13 = grafo3.primeiroListaAdj((int) (short) 0);
        boolean boolean16 = grafo3.existeAresta((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta((int) (short) 0, (int) ' ', (int) (short) 0);
        boolean boolean13 = grafo0.existeAresta((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.insereAresta((int) '#', (int) (short) 10, (int) (short) 100);
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        ds.Aresta aresta13 = grafo3.retiraAresta((int) ' ', (int) (short) 10);
        ds.Aresta aresta16 = grafo3.retiraAresta(0, (int) (short) 10);
        grafo3.insereAresta((int) (short) 1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (short) 100, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) 'a');
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta(0, (int) '4');
        grafo3.imprime();
        ds.Aresta aresta16 = grafo3.retiraAresta((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.listaAdjVazia((int) (byte) 0);
        ds.Aresta aresta13 = grafo0.retiraAresta(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo0.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo9.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        grafo0.imprime();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta((int) (short) 0, (int) ' ', (int) (short) 0);
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(10);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo15.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) -1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(10);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo12.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) 'a');
        grafo12.insereAresta((int) ' ', (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(1);
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean13 = grafo0.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo3.retiraAresta((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Aresta aresta12 = grafo0.retiraAresta(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.imprime();
        java.lang.Class<?> wildcardClass16 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 1);
        ds.Aresta aresta16 = grafo12.proxAdj((int) (short) 0);
        boolean boolean18 = grafo12.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Aresta aresta4 = grafo0.proxAdj(10);
        ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) ' ');
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta17 = grafo11.retiraAresta((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Aresta aresta12 = grafo9.primeiroListaAdj((int) '4');
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (byte) 0, (int) (short) 1, 100);
        ds.Grafo grafo17 = grafo9.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo17);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo12.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        grafo0.insereAresta((int) '#', (int) 'a', 0);
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta14 = grafo0.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta14 = grafo0.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        boolean boolean8 = grafo3.existeAresta((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        grafo4.imprime();
        ds.Aresta aresta7 = grafo4.primeiroListaAdj(1);
        ds.Aresta aresta10 = grafo4.retiraAresta(0, 0);
        grafo4.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        boolean boolean11 = grafo0.listaAdjVazia((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        grafo9.insereAresta((int) (byte) 0, (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Aresta aresta14 = grafo0.proxAdj((int) '4');
        ds.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.proxAdj((int) '#');
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        boolean boolean11 = grafo0.existeAresta((int) (byte) 1, (int) (byte) 1);
        boolean boolean13 = grafo0.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass14 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Aresta aresta16 = grafo0.proxAdj((int) (byte) 1);
        grafo0.insereAresta((int) (byte) 1, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 1, (int) (short) 0);
        boolean boolean16 = grafo0.listaAdjVazia((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta((int) (byte) 1, (int) '4');
        boolean boolean15 = grafo3.existeAresta((int) (byte) 1, (int) '4');
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass10 = grafo9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        boolean boolean19 = grafo15.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta22 = grafo15.retiraAresta(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(aresta22);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) '4', (int) (short) 1, 1);
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) 'a');
        ds.Grafo grafo19 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta21 = grafo19.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo19);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia(10);
        ds.Grafo grafo15 = grafo12.grafoTransposto();
        ds.Grafo grafo16 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo12.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo11.existeAresta(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) 'a');
        boolean boolean17 = grafo12.existeAresta(1, (int) '#');
        ds.Grafo grafo18 = grafo12.grafoTransposto();
        grafo18.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        ds.Aresta aresta20 = grafo0.primeiroListaAdj((int) '#');
        ds.Aresta aresta22 = grafo0.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertNotNull(aresta22);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo10.retiraAresta((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        boolean boolean14 = grafo0.listaAdjVazia((int) 'a');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        grafo15.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo15.insereAresta((int) (byte) -1, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) '#', (int) (short) 1);
        boolean boolean13 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 10);
        grafo3.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo13.existeAresta((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (short) 0, (int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo0.retiraAresta((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.proxAdj((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.insereAresta(10, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta18 = grafo0.retiraAresta((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        grafo10.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        grafo0.insereAresta((int) (short) 1, (int) '#', 10);
        ds.Aresta aresta20 = grafo0.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        grafo3.imprime();
        ds.Grafo grafo11 = grafo3.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo3.insereAresta((int) (short) 100, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.proxAdj(10);
        grafo0.insereAresta((int) ' ', 1, (int) (byte) 100);
        grafo0.imprime();
        ds.Aresta aresta19 = grafo0.proxAdj((int) (short) 1);
        ds.Aresta aresta21 = grafo0.proxAdj((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNull(aresta21);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean19 = grafo0.existeAresta((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        ds.Aresta aresta16 = grafo10.primeiroListaAdj((int) (short) 1);
        ds.Aresta aresta18 = grafo10.primeiroListaAdj(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean13 = grafo0.existeAresta((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        boolean boolean10 = grafo0.existeAresta((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo10.retiraAresta((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) '4');
        ds.Aresta aresta16 = grafo0.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta((int) (byte) 1, (int) '4');
        grafo3.insereAresta(1, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        boolean boolean19 = grafo3.existeAresta(10, (int) '4');
        ds.Grafo grafo20 = grafo3.grafoTransposto();
        ds.Aresta aresta23 = grafo20.retiraAresta((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta26 = grafo20.retiraAresta((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(grafo20);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = aresta12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.proxAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo10.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        boolean boolean16 = grafo11.listaAdjVazia(0);
        ds.Grafo grafo17 = grafo11.grafoTransposto();
        ds.Aresta aresta19 = grafo11.proxAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(grafo17);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo9.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        boolean boolean16 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta7 = grafo0.proxAdj((int) '4');
        boolean boolean9 = grafo0.listaAdjVazia(1);
        boolean boolean11 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean15 = grafo0.listaAdjVazia((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo3.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta15 = grafo12.retiraAresta((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.proxAdj(1);
        java.lang.Class<?> wildcardClass9 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        boolean boolean17 = grafo9.listaAdjVazia((int) '#');
        grafo9.insereAresta(0, (int) (byte) 0, 0);
        grafo9.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        boolean boolean17 = grafo15.listaAdjVazia((int) ' ');
        ds.Grafo grafo18 = grafo15.grafoTransposto();
        boolean boolean21 = grafo18.existeAresta(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo18.insereAresta((int) (byte) 1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) '4', (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo0.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta12 = grafo0.primeiroListaAdj(0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta16 = grafo9.primeiroListaAdj((int) (byte) 10);
        boolean boolean19 = grafo9.existeAresta((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) ' ');
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        grafo0.imprime();
        boolean boolean9 = grafo0.existeAresta((int) (byte) 0, (int) (short) 0);
        grafo0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo0.existeAresta(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        boolean boolean6 = grafo0.existeAresta(0, 1);
        grafo0.insereAresta((int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean8 = grafo0.existeAresta((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        ds.Aresta aresta16 = grafo3.retiraAresta((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta20 = grafo9.retiraAresta(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        boolean boolean10 = grafo3.listaAdjVazia(10);
        ds.Aresta aresta13 = grafo3.retiraAresta((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean12 = grafo10.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo13.existeAresta((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 10);
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        grafo13.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Aresta aresta10 = grafo0.retiraAresta(0, (int) 'a');
        boolean boolean13 = grafo0.existeAresta((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        boolean boolean12 = grafo3.existeAresta(0, (int) '4');
        ds.Aresta aresta15 = grafo3.retiraAresta(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo8.listaAdjVazia((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Aresta aresta15 = grafo12.retiraAresta(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 1);
        ds.Aresta aresta16 = grafo12.proxAdj((int) (short) 0);
        ds.Aresta aresta18 = grafo12.proxAdj((int) ' ');
        grafo12.imprime();
        grafo12.insereAresta((int) '4', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '4', (int) '4');
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        ds.Aresta aresta17 = grafo0.proxAdj((int) (short) 10);
        boolean boolean20 = grafo0.existeAresta(0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        boolean boolean12 = grafo3.existeAresta(10, (int) (byte) 0);
        ds.Aresta aresta14 = grafo3.primeiroListaAdj(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia((int) '4');
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo11.insereAresta((int) (byte) -1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        ds.Grafo grafo18 = grafo9.grafoTransposto();
        ds.Aresta aresta20 = grafo9.proxAdj((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNotNull(grafo18);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        ds.Aresta aresta19 = grafo9.proxAdj((int) 'a');
        ds.Grafo grafo20 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = grafo20.listaAdjVazia((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta19);
        org.junit.Assert.assertNotNull(grafo20);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        grafo10.imprime();
        boolean boolean13 = grafo10.listaAdjVazia((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        ds.Aresta aresta17 = grafo9.primeiroListaAdj((int) ' ');
        boolean boolean20 = grafo9.existeAresta((int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta23 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo12.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo3.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo10.imprime();
        ds.Aresta aresta13 = grafo10.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = grafo10.existeAresta((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) 'a');
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) -1, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta(0, (int) 'a');
        ds.Grafo grafo13 = grafo8.grafoTransposto();
        java.lang.Class<?> wildcardClass14 = grafo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        ds.Aresta aresta8 = grafo3.primeiroListaAdj(1);
        grafo3.imprime();
        java.lang.Class<?> wildcardClass10 = grafo3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta13 = grafo0.proxAdj((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass5 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta((int) ' ', (int) ' ');
        ds.Aresta aresta14 = grafo8.proxAdj((int) (short) 0);
        ds.Grafo grafo15 = grafo8.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta((int) (short) 0, (int) ' ', (int) (short) 0);
        grafo0.insereAresta((int) ' ', (int) (byte) 10, 100);
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = grafo0.existeAresta((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        grafo3.imprime();
        grafo3.imprime();
        ds.Grafo grafo13 = grafo3.grafoTransposto();
        ds.Grafo grafo14 = grafo13.grafoTransposto();
        grafo13.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        boolean boolean9 = grafo0.listaAdjVazia(0);
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        boolean boolean10 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Grafo grafo12 = grafo11.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) 'a');
        boolean boolean17 = grafo12.existeAresta(1, (int) '#');
        ds.Grafo grafo18 = grafo12.grafoTransposto();
        grafo18.insereAresta((int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(grafo18);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) '#', (int) 'a');
        boolean boolean6 = grafo0.existeAresta(0, 1);
        boolean boolean8 = grafo0.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean12 = grafo0.listaAdjVazia((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        grafo8.imprime();
        boolean boolean12 = grafo8.existeAresta(0, (int) 'a');
        ds.Grafo grafo13 = grafo8.grafoTransposto();
        ds.Aresta aresta15 = grafo8.proxAdj((int) (short) 0);
        grafo8.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia(10);
        ds.Aresta aresta14 = grafo0.primeiroListaAdj(0);
        boolean boolean17 = grafo0.existeAresta((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta19 = grafo0.proxAdj((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Grafo grafo2 = grafo0.grafoTransposto();
        boolean boolean4 = grafo0.listaAdjVazia(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        ds.Grafo grafo12 = grafo10.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj((int) (short) 0);
        ds.Aresta aresta16 = grafo12.proxAdj((int) '4');
        grafo12.insereAresta((int) (byte) 10, 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta23 = grafo12.retiraAresta((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta10 = grafo3.proxAdj((int) 'a');
        ds.Aresta aresta12 = grafo3.primeiroListaAdj((int) (byte) 1);
        grafo3.insereAresta((int) 'a', (int) (byte) 10, (int) '#');
        grafo3.imprime();
        ds.Aresta aresta19 = grafo3.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Aresta aresta3 = grafo0.retiraAresta(1, (int) '4');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo0.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta7 = grafo0.proxAdj(0);
        ds.Aresta aresta10 = grafo0.retiraAresta(1, (int) (short) 0);
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo11.retiraAresta((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        boolean boolean5 = grafo3.listaAdjVazia((int) (short) 1);
        grafo3.imprime();
        boolean boolean8 = grafo3.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo9 = grafo3.grafoTransposto();
        ds.Grafo grafo10 = grafo9.grafoTransposto();
        ds.Grafo grafo11 = grafo10.grafoTransposto();
        boolean boolean13 = grafo11.listaAdjVazia(0);
        ds.Grafo grafo14 = grafo11.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta17 = grafo14.retiraAresta((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(grafo14);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta7 = grafo0.primeiroListaAdj((int) '4');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = aresta9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Grafo grafo15 = grafo9.grafoTransposto();
        boolean boolean17 = grafo9.listaAdjVazia((int) '#');
        grafo9.insereAresta(0, (int) (byte) 0, 0);
        ds.Aresta aresta23 = grafo9.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(aresta23);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo3 = grafo0.grafoTransposto();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 0);
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        ds.Aresta aresta10 = grafo0.primeiroListaAdj(0);
        boolean boolean12 = grafo0.listaAdjVazia((int) '4');
        grafo0.imprime();
        ds.Aresta aresta15 = grafo0.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(grafo3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 0, (int) 'a', (int) (byte) -1);
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 0);
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo9.existeAresta((int) (short) 10, (int) '4');
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 1, (int) (short) 1);
        grafo9.imprime();
        ds.Aresta aresta21 = grafo9.retiraAresta((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(aresta8);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta21);
    }
}

