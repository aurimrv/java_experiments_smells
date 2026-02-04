package ds.seed9121;

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
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta3 = grafo0.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo0.existeAresta((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass3 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo0.listaAdjVazia((-1));
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
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo0.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta((int) (byte) -1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass5 = grafo4.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo4.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo9.retiraAresta((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        java.lang.Class<?> wildcardClass7 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean9 = grafo7.listaAdjVazia((int) '4');
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo5.proxAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo0.proxAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.insereAresta((int) '4', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        grafo0.imprime();
        java.lang.Class<?> wildcardClass6 = grafo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = grafo0.existeAresta(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta5 = grafo0.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = grafo0.listaAdjVazia((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo7.existeAresta((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = grafo0.listaAdjVazia(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo0.retiraAresta((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo4.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) ' ', (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo11.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        boolean boolean12 = grafo0.existeAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta(0, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (byte) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = aresta3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        java.lang.Class<?> wildcardClass8 = grafo6.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo10.retiraAresta((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        java.lang.Class<?> wildcardClass4 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo6.retiraAresta(0, 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta3 = grafo0.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        java.lang.Class<?> wildcardClass7 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo7.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((-1), (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta13 = grafo10.retiraAresta((int) '#', (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        boolean boolean13 = grafo10.existeAresta(0, (int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) 'a', (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo6.existeAresta((int) 'a', (int) (short) 10);
        boolean boolean14 = grafo6.existeAresta(10, (int) (short) 0);
        ds.Aresta aresta17 = grafo6.retiraAresta((int) '#', 10);
        ds.Aresta aresta20 = grafo6.retiraAresta(0, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 1, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo6.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (short) 0);
        ds.Aresta aresta9 = grafo4.primeiroListaAdj(10);
        // The following exception was thrown during execution in test generation
        try {
            grafo4.insereAresta((int) (short) 100, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta(0, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo0.proxAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo12.primeiroListaAdj(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) 0, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo0.retiraAresta((int) (short) 0, (int) 'a');
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo0.existeAresta((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass5 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta4 = grafo1.retiraAresta((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.insereAresta((int) (byte) 10, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo6.listaAdjVazia((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (short) 0);
        boolean boolean10 = grafo4.existeAresta((int) '4', (int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta14 = grafo9.retiraAresta((int) '4', 10);
        grafo9.insereAresta((int) 'a', 0, (int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        ds.Aresta aresta6 = grafo0.proxAdj(1);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo9.insereAresta((int) (byte) 100, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean8 = grafo4.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta14 = grafo9.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo7.proxAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo5.primeiroListaAdj((int) (short) 0);
        ds.Aresta aresta10 = grafo5.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass13 = grafo12.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.insereAresta(10, (int) '4', (int) (byte) 0);
        boolean boolean18 = grafo12.listaAdjVazia((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta20 = grafo12.primeiroListaAdj((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Aresta aresta9 = grafo6.proxAdj(0);
        grafo6.imprime();
        grafo6.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta7 = grafo5.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta14 = grafo9.retiraAresta((int) '4', 10);
        ds.Aresta aresta17 = grafo9.retiraAresta((int) (byte) 10, (int) '4');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj(0);
        boolean boolean10 = grafo6.listaAdjVazia((int) '4');
        grafo6.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo6.proxAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        ds.Grafo grafo2 = grafo1.grafoTransposto();
        grafo2.imprime();
        org.junit.Assert.assertNotNull(grafo1);
        org.junit.Assert.assertNotNull(grafo2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) 'a', 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        grafo6.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta((int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.retiraAresta((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta9 = grafo0.retiraAresta(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean6 = grafo0.listaAdjVazia((int) (byte) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.proxAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo7.retiraAresta((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = grafo12.listaAdjVazia((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.insereAresta(10, (int) '4', (int) (byte) 0);
        boolean boolean18 = grafo12.listaAdjVazia((int) '4');
        grafo12.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '#', 0);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(0);
        grafo10.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Grafo grafo0 = new ds.Grafo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = grafo0.existeAresta((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo0.existeAresta(10, (int) 'a');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '#');
        ds.Aresta aresta12 = grafo0.retiraAresta((int) 'a', (int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.existeAresta(0, 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        grafo5.insereAresta(10, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta10 = grafo0.proxAdj((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.insereAresta(1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((-1), (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass11 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        ds.Aresta aresta11 = grafo5.retiraAresta(1, 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = grafo0.existeAresta((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.retiraAresta((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        ds.Aresta aresta7 = grafo0.proxAdj((int) ' ');
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNull(aresta7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean10 = grafo6.listaAdjVazia((int) (byte) 1);
        grafo6.insereAresta(0, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = grafo6.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Aresta aresta9 = grafo0.primeiroListaAdj(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean10 = grafo6.listaAdjVazia((int) (byte) 1);
        grafo6.insereAresta(0, (int) (byte) 1, (int) (byte) 100);
        grafo6.imprime();
        java.lang.Class<?> wildcardClass16 = grafo6.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass8 = grafo7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        java.lang.Class<?> wildcardClass7 = grafo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        boolean boolean7 = grafo0.listaAdjVazia(1);
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.retiraAresta((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo6.listaAdjVazia((int) (short) 0);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo5.primeiroListaAdj((int) (short) 0);
        boolean boolean10 = grafo5.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) -1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta(0, (int) (short) 0);
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj(0);
        boolean boolean10 = grafo6.listaAdjVazia((int) '4');
        java.lang.Class<?> wildcardClass11 = grafo6.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 0);
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        ds.Aresta aresta6 = grafo0.proxAdj((int) (short) 10);
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo0.proxAdj((int) ' ');
        ds.Aresta aresta10 = grafo0.primeiroListaAdj((int) 'a');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta(0, (int) (short) 0);
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) '4');
        boolean boolean13 = grafo0.listaAdjVazia((int) '4');
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo0.insereAresta((int) 'a', (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        boolean boolean9 = grafo0.listaAdjVazia((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean10 = grafo6.listaAdjVazia((int) (byte) 1);
        grafo6.insereAresta(0, (int) (byte) 1, (int) (byte) 100);
        grafo6.imprime();
        ds.Aresta aresta17 = grafo6.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(aresta17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        ds.Aresta aresta9 = grafo0.proxAdj((int) (byte) 10);
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = aresta11.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = grafo0.existeAresta((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean12 = grafo0.listaAdjVazia((int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        boolean boolean10 = grafo0.existeAresta(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta13 = grafo0.retiraAresta((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.proxAdj(1);
        ds.Aresta aresta14 = grafo10.primeiroListaAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta(0, (int) (short) 0);
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 10);
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta(10, (int) (short) 1, (int) (byte) 100);
        ds.Aresta aresta17 = grafo0.proxAdj(0);
        ds.Aresta aresta20 = grafo0.retiraAresta((int) 'a', (int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta17);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo10.primeiroListaAdj((int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo0.insereAresta((int) (short) 10, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (short) 10, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        grafo7.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        grafo12.insereAresta(0, (int) '#', (int) 'a');
        ds.Aresta aresta18 = grafo12.proxAdj(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(aresta18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean9 = grafo0.existeAresta(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (short) 0, (int) '#', (int) (byte) 100);
        ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) ' ');
        boolean boolean8 = grafo0.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo0.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = aresta14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        grafo4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta10 = grafo4.retiraAresta((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            grafo10.insereAresta((int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Grafo grafo0 = new ds.Grafo();
        ds.Grafo grafo1 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = grafo0.existeAresta(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(grafo1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo6.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.proxAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = aresta6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        boolean boolean17 = grafo4.existeAresta(0, (int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        ds.Aresta aresta6 = grafo0.retiraAresta((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta(100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        ds.Aresta aresta15 = grafo12.primeiroListaAdj((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.insereAresta((int) '#', 0, (int) (byte) 100);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Aresta aresta14 = grafo12.proxAdj(10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean2 = grafo0.listaAdjVazia((int) (short) 10);
        ds.Aresta aresta4 = grafo0.proxAdj((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(aresta4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Aresta aresta9 = grafo6.proxAdj(0);
        grafo6.imprime();
        ds.Aresta aresta12 = grafo6.primeiroListaAdj((int) '#');
        ds.Aresta aresta14 = grafo6.primeiroListaAdj((int) (short) 0);
        boolean boolean17 = grafo6.existeAresta(0, 10);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Aresta aresta6 = grafo0.primeiroListaAdj((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta8 = grafo0.proxAdj((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNull(aresta6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.proxAdj((int) (byte) 1);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        grafo12.insereAresta(10, (int) '4', (int) (byte) 0);
        grafo12.imprime();
        ds.Aresta aresta20 = grafo12.retiraAresta((int) 'a', 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNull(aresta20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta14 = grafo0.retiraAresta((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        grafo4.imprime();
        ds.Grafo grafo16 = grafo4.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        boolean boolean14 = grafo0.existeAresta((int) '#', 0);
        grafo0.insereAresta((int) 'a', (int) '4', (-1));
        ds.Aresta aresta20 = grafo0.proxAdj(0);
        boolean boolean22 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(aresta20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) (byte) -1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo0.retiraAresta((int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo0.existeAresta((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        boolean boolean15 = grafo12.existeAresta((int) (short) 0, 1);
        boolean boolean17 = grafo12.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        grafo0.imprime();
        java.lang.Class<?> wildcardClass9 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        boolean boolean9 = grafo5.existeAresta((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        ds.Aresta aresta6 = grafo0.proxAdj((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = aresta6.getClass();
        org.junit.Assert.assertNotNull(aresta6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        ds.Aresta aresta16 = grafo4.proxAdj((int) (short) 1);
        ds.Aresta aresta18 = grafo4.proxAdj((int) (short) 0);
        boolean boolean20 = grafo4.listaAdjVazia(0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNull(aresta18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = grafo0.existeAresta((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        grafo4.imprime();
        ds.Aresta aresta10 = grafo4.retiraAresta(10, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        grafo4.imprime();
        boolean boolean18 = grafo4.existeAresta((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Aresta aresta9 = grafo6.proxAdj(0);
        grafo6.imprime();
        ds.Grafo grafo11 = grafo6.grafoTransposto();
        java.lang.Class<?> wildcardClass12 = grafo6.getClass();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        grafo5.imprime();
        boolean boolean9 = grafo5.listaAdjVazia((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo5.existeAresta((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo0.retiraAresta((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Grafo grafo11 = grafo0.grafoTransposto();
        ds.Aresta aresta13 = grafo0.primeiroListaAdj((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = aresta13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Aresta aresta9 = grafo6.proxAdj(0);
        grafo6.imprime();
        ds.Aresta aresta12 = grafo6.primeiroListaAdj((int) '#');
        ds.Aresta aresta14 = grafo6.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo15 = grafo6.grafoTransposto();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj(0);
        ds.Aresta aresta10 = grafo6.primeiroListaAdj(1);
        grafo6.imprime();
        ds.Aresta aresta14 = grafo6.retiraAresta((int) (byte) 0, (int) '#');
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        boolean boolean16 = grafo0.existeAresta(1, (int) ' ');
        boolean boolean18 = grafo0.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        grafo4.imprime();
        ds.Grafo grafo8 = grafo4.grafoTransposto();
        ds.Grafo grafo9 = grafo8.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo8);
        org.junit.Assert.assertNotNull(grafo9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Grafo grafo8 = grafo5.grafoTransposto();
        grafo5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = grafo5.existeAresta((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        grafo0.insereAresta((int) (short) 10, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo0.insereAresta((int) 'a', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo4.existeAresta((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        ds.Grafo grafo8 = grafo7.grafoTransposto();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta8 = grafo0.primeiroListaAdj((int) '4');
        grafo0.imprime();
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        ds.Aresta aresta12 = grafo0.primeiroListaAdj((int) (short) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        boolean boolean8 = grafo0.listaAdjVazia((int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Grafo grafo12 = grafo9.grafoTransposto();
        boolean boolean14 = grafo12.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo6.existeAresta((int) 'a', (int) (short) 10);
        boolean boolean13 = grafo6.listaAdjVazia(10);
        grafo6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta16 = grafo6.primeiroListaAdj((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta10 = grafo0.proxAdj((int) '4');
        ds.Aresta aresta12 = grafo0.proxAdj(1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNull(aresta12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        grafo0.insereAresta(0, (int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = grafo0.existeAresta((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        boolean boolean15 = grafo0.existeAresta((int) (short) 0, (int) (byte) 1);
        ds.Grafo grafo16 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(grafo16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        ds.Aresta aresta16 = grafo4.proxAdj((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = grafo4.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(aresta16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        grafo4.imprime();
        boolean boolean9 = grafo4.existeAresta((int) 'a', (int) (short) 1);
        ds.Grafo grafo10 = grafo4.grafoTransposto();
        grafo4.insereAresta((int) (short) 1, (int) '4', (int) (short) -1);
        boolean boolean16 = grafo4.listaAdjVazia((int) 'a');
        ds.Aresta aresta19 = grafo4.retiraAresta(0, (int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(aresta19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Grafo grafo0 = new ds.Grafo();
        boolean boolean3 = grafo0.existeAresta((int) (byte) 0, (int) (short) 10);
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta10 = grafo0.proxAdj((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta(10, (int) (short) 1, (int) (byte) 100);
        ds.Aresta aresta17 = grafo0.proxAdj(0);
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '4');
        ds.Grafo grafo10 = grafo0.grafoTransposto();
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo13 = grafo0.grafoTransposto();
        grafo0.imprime();
        ds.Aresta aresta16 = grafo0.primeiroListaAdj((int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNotNull(grafo13);
        org.junit.Assert.assertNull(aresta16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        ds.Grafo grafo6 = grafo5.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean10 = grafo6.listaAdjVazia((int) (byte) 1);
        grafo6.insereAresta(0, (int) (byte) 1, (int) (byte) 100);
        grafo6.imprime();
        ds.Aresta aresta17 = grafo6.proxAdj((int) ' ');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(aresta17);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo0.existeAresta(10, (int) 'a');
        ds.Aresta aresta9 = grafo0.primeiroListaAdj((int) '#');
        ds.Aresta aresta11 = grafo0.primeiroListaAdj(0);
        grafo0.insereAresta(1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Aresta aresta5 = grafo0.primeiroListaAdj(0);
        boolean boolean7 = grafo0.listaAdjVazia((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = grafo0.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        grafo6.imprime();
        ds.Aresta aresta9 = grafo6.proxAdj(0);
        grafo6.imprime();
        ds.Aresta aresta12 = grafo6.primeiroListaAdj((int) '#');
        ds.Aresta aresta14 = grafo6.primeiroListaAdj((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            grafo6.insereAresta((int) (byte) 100, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta12);
        org.junit.Assert.assertNull(aresta14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Grafo grafo7 = grafo0.grafoTransposto();
        grafo7.imprime();
        ds.Aresta aresta10 = grafo7.primeiroListaAdj((int) 'a');
        ds.Grafo grafo11 = grafo7.grafoTransposto();
        boolean boolean13 = grafo7.listaAdjVazia((int) (byte) 1);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNotNull(grafo7);
        org.junit.Assert.assertNull(aresta10);
        org.junit.Assert.assertNotNull(grafo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        grafo0.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo9.listaAdjVazia((int) (short) 1);
        ds.Aresta aresta14 = grafo9.retiraAresta((int) '4', 10);
        boolean boolean16 = grafo9.listaAdjVazia((int) '#');
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(aresta14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.primeiroListaAdj((int) (short) 10);
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean5 = grafo0.listaAdjVazia((int) ' ');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta8 = grafo6.primeiroListaAdj((int) (byte) 1);
        boolean boolean11 = grafo6.existeAresta((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo4.grafoTransposto();
        boolean boolean7 = grafo4.listaAdjVazia((int) (short) 0);
        boolean boolean10 = grafo4.existeAresta(0, (int) (byte) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta9 = grafo5.primeiroListaAdj((int) (byte) 0);
        ds.Aresta aresta11 = grafo5.proxAdj((int) (short) 1);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNull(aresta11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (byte) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        ds.Grafo grafo13 = grafo12.grafoTransposto();
        grafo12.imprime();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
        org.junit.Assert.assertNotNull(grafo13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        ds.Aresta aresta9 = grafo5.primeiroListaAdj((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = grafo5.getClass();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        boolean boolean14 = grafo0.existeAresta(0, 1);
        ds.Grafo grafo15 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(grafo15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.insereAresta((int) (byte) 10, 0, (int) 'a');
        grafo0.imprime();
        grafo0.imprime();
        grafo0.imprime();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        ds.Grafo grafo5 = grafo0.grafoTransposto();
        ds.Aresta aresta7 = grafo5.proxAdj((int) (short) 0);
        boolean boolean9 = grafo5.listaAdjVazia((int) (short) 0);
        ds.Grafo grafo10 = grafo5.grafoTransposto();
        ds.Aresta aresta13 = grafo5.retiraAresta(0, (int) (short) 0);
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertNotNull(grafo5);
        org.junit.Assert.assertNull(aresta7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(grafo10);
        org.junit.Assert.assertNull(aresta13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        ds.Grafo grafo4 = grafo0.grafoTransposto();
        boolean boolean7 = grafo0.existeAresta(10, (int) 'a');
        ds.Grafo grafo8 = grafo0.grafoTransposto();
        // The following exception was thrown during execution in test generation
        try {
            ds.Aresta aresta11 = grafo0.retiraAresta((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNotNull(grafo4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(grafo8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        grafo0.insereAresta((int) (short) 0, (int) (short) 1, (int) (short) 1);
        ds.Aresta aresta9 = grafo0.proxAdj((int) (byte) 10);
        ds.Aresta aresta11 = grafo0.primeiroListaAdj((int) (short) 0);
        ds.Grafo grafo12 = grafo0.grafoTransposto();
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertNotNull(aresta11);
        org.junit.Assert.assertNotNull(grafo12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        grafo0.imprime();
        ds.Aresta aresta5 = grafo0.retiraAresta((int) (byte) 1, (int) '4');
        ds.Grafo grafo6 = grafo0.grafoTransposto();
        ds.Aresta aresta9 = grafo0.retiraAresta((int) (short) 0, (int) 'a');
        boolean boolean12 = grafo0.existeAresta((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNull(aresta5);
        org.junit.Assert.assertNotNull(grafo6);
        org.junit.Assert.assertNull(aresta9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Grafo grafo0 = new ds.Grafo();
        grafo0.imprime();
        ds.Aresta aresta3 = grafo0.proxAdj((int) '#');
        boolean boolean6 = grafo0.existeAresta(0, (int) '4');
        grafo0.imprime();
        grafo0.imprime();
        ds.Grafo grafo9 = grafo0.grafoTransposto();
        boolean boolean11 = grafo0.listaAdjVazia((int) (short) 1);
        grafo0.insereAresta(10, (int) (short) 1, (int) (byte) 100);
        boolean boolean17 = grafo0.listaAdjVazia((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = grafo0.existeAresta((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(aresta3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(grafo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

