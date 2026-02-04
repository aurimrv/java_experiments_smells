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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        java.lang.Object obj6 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        java.lang.Object obj9 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (short) -1);
        ds.Item[] itemArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin5.refaz((int) (byte) 1, 0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin5.copia(itemArray10);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.imprime();
        ds.Item item6 = fPHeapMin4.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave((int) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.refaz(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.imprime();
        ds.Item item9 = fPHeapMin7.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) item9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        ds.Item item9 = fPHeapMin1.min();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        java.lang.Class<?> wildcardClass9 = fPHeapMin8.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        java.lang.Class<?> wildcardClass9 = itemArray6.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        java.lang.Class<?> wildcardClass16 = fPHeapMin12.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave(0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass3 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        java.lang.Class<?> wildcardClass8 = itemArray6.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        ds.Item item9 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin40.refaz((int) (byte) 1, 0);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin40.copia(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.refaz((int) (byte) 1, 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin7.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        java.lang.Class<?> wildcardClass38 = itemArray31.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        java.lang.Class<?> wildcardClass20 = fPHeapMin9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = item12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.refaz((int) (byte) 1, 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin7.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        java.lang.Object obj40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        java.lang.Class<?> wildcardClass15 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass39 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin1.copia(itemArray38);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin5.refaz((int) (byte) 1, 0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin5.copia(itemArray10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin5.copia(itemArray12);
        ds.Item item16 = fPHeapMin5.min();
        fPHeapMin5.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin38.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        java.lang.Object obj39 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        java.lang.Class<?> wildcardClass26 = itemArray21.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) 'a');
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin6.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin17.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin26.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass10 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.constroi();
        java.lang.Class<?> wildcardClass40 = fPHeapMin38.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) 'a');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) 'a');
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin35.copia(itemArray36);
        fPHeapMin21.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray36);
        fPHeapMin6.copia(itemArray36);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray36);
        fPHeapMin1.copia(itemArray36);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin8.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin26.diminuiChave(0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin21.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) 'a');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) itemArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin25.copia(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) 'a');
        fPHeapMin45.imprime();
        fPHeapMin45.constroi();
        fPHeapMin45.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass18 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        java.lang.Class<?> wildcardClass24 = itemArray20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin25.copia(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin38.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item7 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin24.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMin24.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin6.copia(itemArray13);
        ds.Item item17 = fPHeapMin6.min();
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        java.lang.Class<?> wildcardClass27 = itemArray21.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.refaz((int) (byte) 1, 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin7.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        ds.Item item24 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass25 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item18 = fPHeapMin17.min();
        fPHeapMin17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 1, (int) (short) -1);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin44.refaz((int) (byte) 1, 0);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMin44.copia(itemArray49);
        fPHeapMin44.constroi();
        ds.Item item52 = fPHeapMin44.min();
        fPHeapMin44.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = item3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) 'a');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin9.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) 'a');
        ds.Item item25 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin27.refaz((int) (byte) 1, 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin27.copia(itemArray32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin27.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin24.copia(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin9.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item51 = fPHeapMin50.min();
        fPHeapMin50.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) 'a');
        ds.Item item55 = fPHeapMin54.min();
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin57.refaz((int) (byte) 1, 0);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin57.copia(itemArray62);
        ds.Item[] itemArray64 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin57.copia(itemArray64);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray64);
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        fPHeapMin68.copia(itemArray69);
        fPHeapMin54.copia(itemArray69);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item75 = fPHeapMin74.min();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin77.refaz((int) (byte) 1, 0);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMin77.copia(itemArray82);
        ds.Item[] itemArray84 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray84);
        fPHeapMin77.copia(itemArray84);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray84);
        fPHeapMin74.copia(itemArray84);
        fPHeapMin54.copia(itemArray84);
        fPHeapMin50.copia(itemArray84);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) 'a');
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin22.refaz((int) (byte) 1, 0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin22.copia(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        fPHeapMin17.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) 'a');
        ds.Item item33 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin35.refaz((int) (byte) 1, 0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin35.copia(itemArray40);
        ds.Item[] itemArray42 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray42);
        fPHeapMin35.copia(itemArray42);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray42);
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin46.copia(itemArray47);
        fPHeapMin32.copia(itemArray47);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        fPHeapMin17.copia(itemArray47);
        fPHeapMin9.copia(itemArray47);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave(100, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        java.lang.Class<?> wildcardClass14 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((int) (short) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMin27.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item7 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMin24.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin14.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin11.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin34.refaz((int) (byte) 1, 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin34.copia(itemArray39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin34.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        fPHeapMin7.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave(0, (java.lang.Object) itemArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin16.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item42 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.Item item20 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item24 = fPHeapMin23.min();
        fPHeapMin23.refaz(1, (-1));
        java.lang.Class<?> wildcardClass28 = fPHeapMin23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) 'a');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((-1), (java.lang.Object) fPHeapMin11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) 'a');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin1.copia(itemArray38);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass44 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) 'a');
        ds.Item item20 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin22.refaz((int) (byte) 1, 0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin22.copia(itemArray27);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin22.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin33.copia(itemArray34);
        fPHeapMin19.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        ds.Item item45 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = item45.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) itemArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.constroi();
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin38.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        fPHeapMin17.constroi();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '#', (int) (byte) -1);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) 'a');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        java.lang.Class<?> wildcardClass15 = itemArray10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin8.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        fPHeapMin5.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin21.refaz((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray11);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin18.copia(itemArray31);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        java.lang.Class<?> wildcardClass43 = itemArray39.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave(1, (java.lang.Object) wildcardClass43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin1.copia(itemArray38);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) 'a');
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin46.copia(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin50.imprime();
        fPHeapMin50.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        fPHeapMin17.copia(itemArray18);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin8.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin27.imprime();
        fPHeapMin27.constroi();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) 'a');
        ds.Item item35 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin37.refaz((int) (byte) 1, 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin37.copia(itemArray42);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin37.copia(itemArray44);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray44);
        ds.Item[] itemArray49 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        fPHeapMin48.copia(itemArray49);
        fPHeapMin34.copia(itemArray49);
        fPHeapMin31.copia(itemArray49);
        fPHeapMin27.copia(itemArray49);
        fPHeapMin20.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item56 = fPHeapMin20.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item7 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin24.copia(itemArray25);
        java.lang.Class<?> wildcardClass28 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin14.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin11.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin34.refaz((int) (byte) 1, 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin34.copia(itemArray39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin34.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        fPHeapMin7.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.Item item50 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item50);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        java.lang.Class<?> wildcardClass17 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin43.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass6 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        fPHeapMin17.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        fPHeapMin20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.refaz(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin25.copia(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        java.lang.Class<?> wildcardClass43 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray38);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin43.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        java.lang.Class<?> wildcardClass17 = itemArray13.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        java.lang.Class<?> wildcardClass26 = fPHeapMin20.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) 'a');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin39.diminuiChave((int) (short) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        fPHeapMin17.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMin17.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.refaz((int) (byte) 1, 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin7.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item4 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin6.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin3.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin27.imprime();
        fPHeapMin27.constroi();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) 'a');
        ds.Item item35 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin37.refaz((int) (byte) 1, 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin37.copia(itemArray42);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin37.copia(itemArray44);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray44);
        ds.Item[] itemArray49 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        fPHeapMin48.copia(itemArray49);
        fPHeapMin34.copia(itemArray49);
        fPHeapMin31.copia(itemArray49);
        fPHeapMin27.copia(itemArray49);
        fPHeapMin20.copia(itemArray49);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray49);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray31);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin4.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.refaz(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (-1));
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item13 = fPHeapMin12.min();
        fPHeapMin12.refaz(1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item14 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = item14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.refaz(1, (-1));
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        fPHeapMin39.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin39.refaz((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.imprime();
        fPHeapMin38.imprime();
        fPHeapMin38.constroi();
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin38.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item7 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin24.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item34 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin36.refaz((int) (byte) 1, 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin36.copia(itemArray41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin36.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray43);
        fPHeapMin33.copia(itemArray43);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray43);
        fPHeapMin31.copia(itemArray43);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray43);
        ds.Item[] itemArray52 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray52);
        fPHeapMin51.copia(itemArray52);
        fPHeapMin51.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.constroi();
        fPHeapMin38.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) 'a');
        ds.Item item16 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin18.refaz((int) (byte) 1, 0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin18.copia(itemArray23);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin18.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin29.copia(itemArray30);
        fPHeapMin15.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item36 = fPHeapMin35.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin38.refaz((int) (byte) 1, 0);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin38.copia(itemArray43);
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        fPHeapMin38.copia(itemArray45);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray45);
        fPHeapMin35.copia(itemArray45);
        fPHeapMin15.copia(itemArray45);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray45);
        fPHeapMin1.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item55 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass3 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin14.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin11.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin34.refaz((int) (byte) 1, 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin34.copia(itemArray39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin34.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        fPHeapMin7.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        java.lang.Class<?> wildcardClass50 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        fPHeapMin17.copia(itemArray26);
        java.lang.Class<?> wildcardClass31 = fPHeapMin17.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) 'a');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin9.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) 'a');
        ds.Item item25 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin27.refaz((int) (byte) 1, 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin27.copia(itemArray32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin27.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin24.copia(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin9.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        java.lang.Class<?> wildcardClass47 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin16.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin9.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMin9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        java.lang.Class<?> wildcardClass40 = itemArray31.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.refaz(1, (int) (byte) -1);
        fPHeapMin1.imprime();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item11 = fPHeapMin10.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin13.refaz((int) (byte) 1, 0);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin13.copia(itemArray18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin13.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        fPHeapMin10.copia(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        fPHeapMin26.copia(itemArray35);
        fPHeapMin4.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item17 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.Item item12 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) 'a');
        ds.Item item16 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin18.refaz((int) (byte) 1, 0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin18.copia(itemArray23);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin18.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin29.copia(itemArray30);
        fPHeapMin15.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item36 = fPHeapMin35.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin38.refaz((int) (byte) 1, 0);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin38.copia(itemArray43);
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        fPHeapMin38.copia(itemArray45);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray45);
        fPHeapMin35.copia(itemArray45);
        fPHeapMin15.copia(itemArray45);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray45);
        fPHeapMin1.copia(itemArray45);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.imprime();
        java.lang.Class<?> wildcardClass40 = fPHeapMin38.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.refaz((int) '#', 0);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin10.refaz((int) (byte) 1, 0);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item37 = fPHeapMin36.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin39.refaz((int) (byte) 1, 0);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin39.copia(itemArray44);
        ds.Item[] itemArray46 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        fPHeapMin39.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        fPHeapMin36.copia(itemArray46);
        fPHeapMin16.copia(itemArray46);
        fPHeapMin10.copia(itemArray46);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) itemArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        java.lang.Class<?> wildcardClass23 = fPHeapMin22.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item7 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin9.refaz((int) (byte) 1, 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin9.copia(itemArray14);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin9.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMin25.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        fPHeapMin17.copia(itemArray26);
        fPHeapMin17.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) 'a');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray8);
        fPHeapMin14.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        ds.Item item9 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin3.imprime();
        fPHeapMin3.imprime();
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        ds.Item item8 = fPHeapMin3.min();
        ds.Item item9 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin16.refaz((int) (byte) 1, 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin16.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) 'a');
        ds.Item item27 = fPHeapMin26.min();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin29.refaz((int) (byte) 1, 0);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin29.copia(itemArray34);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        fPHeapMin29.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        fPHeapMin40.copia(itemArray41);
        fPHeapMin26.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        fPHeapMin11.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray41);
        fPHeapMin3.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.constroi();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item17 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        java.lang.Class<?> wildcardClass39 = itemArray31.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMin23.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item5 = fPHeapMin4.min();
        fPHeapMin4.imprime();
        fPHeapMin4.imprime();
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item11 = fPHeapMin10.min();
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) 'a');
        ds.Item item15 = fPHeapMin14.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin17.refaz((int) (byte) 1, 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin17.copia(itemArray22);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin17.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin28.copia(itemArray29);
        fPHeapMin14.copia(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item35 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin37.refaz((int) (byte) 1, 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin37.copia(itemArray42);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin37.copia(itemArray44);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray44);
        fPHeapMin34.copia(itemArray44);
        fPHeapMin14.copia(itemArray44);
        fPHeapMin10.copia(itemArray44);
        fPHeapMin4.copia(itemArray44);
        fPHeapMin1.copia(itemArray44);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.refaz((int) '#', 0);
        ds.Item item8 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin39.refaz((int) (byte) 1, 0);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin39.copia(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin1.copia(itemArray44);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin18.refaz((int) (byte) 1, 0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin18.copia(itemArray23);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin18.copia(itemArray25);
        fPHeapMin18.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin18.constroi();
        fPHeapMin18.constroi();
        ds.Item item34 = fPHeapMin18.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave(10, (java.lang.Object) item34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        fPHeapMin39.imprime();
        ds.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin39.insere(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        fPHeapMin38.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item47 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin49.refaz((int) (byte) 1, 0);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMin49.copia(itemArray54);
        ds.Item[] itemArray56 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray56);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray56);
        fPHeapMin49.copia(itemArray56);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray56);
        fPHeapMin46.copia(itemArray56);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray56);
        fPHeapMin44.copia(itemArray56);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray56);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray56);
        fPHeapMin38.copia(itemArray56);
        java.lang.Class<?> wildcardClass67 = fPHeapMin38.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin25.copia(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin17.imprime();
        fPHeapMin17.imprime();
        fPHeapMin17.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin17.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin6.copia(itemArray13);
        fPHeapMin6.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) 'a');
        ds.Item item25 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin27.refaz((int) (byte) 1, 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin27.copia(itemArray32);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin27.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin24.copia(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin43.copia(itemArray44);
        fPHeapMin6.copia(itemArray44);
        fPHeapMin4.copia(itemArray44);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray44);
        fPHeapMin1.copia(itemArray44);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin10.refaz((int) (byte) 1, 0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin10.copia(itemArray15);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin7.copia(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin25.refaz((int) (byte) 1, 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin25.copia(itemArray30);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin25.copia(itemArray32);
        fPHeapMin23.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        fPHeapMin20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMin20.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) 'a');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin6.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) 'a');
        ds.Item item12 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin14.refaz((int) (byte) 1, 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin14.copia(itemArray19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin14.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin11.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item32 = fPHeapMin31.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin34.refaz((int) (byte) 1, 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin34.copia(itemArray39);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin34.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        fPHeapMin7.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray41);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        fPHeapMin3.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) 'a');
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin11.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin5.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item29 = fPHeapMin1.min();
        ds.Item item30 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) 'a');
        ds.Item item34 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin36.refaz((int) (byte) 1, 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin36.copia(itemArray41);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin36.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray43);
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        fPHeapMin47.copia(itemArray48);
        fPHeapMin33.copia(itemArray48);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray48);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray53);
        fPHeapMin52.copia(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) itemArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin6.refaz((int) (byte) 1, 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) 'a');
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin1.copia(itemArray31);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 1, (int) (short) -1);
        fPHeapMin1.refaz((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) 'a');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        java.lang.Class<?> wildcardClass15 = fPHeapMin6.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) 'a');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin8.refaz((int) (byte) 1, 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin8.copia(itemArray13);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin8.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin5.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin28.refaz((int) (byte) 1, 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin28.copia(itemArray33);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin28.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin25.copia(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) 'a');
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin7.refaz((int) (byte) 1, 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin7.copia(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        java.lang.Class<?> wildcardClass24 = itemArray19.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) 'a');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item13 = fPHeapMin12.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin15.refaz((int) (byte) 1, 0);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin15.copia(itemArray20);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin15.copia(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        fPHeapMin12.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        fPHeapMin10.copia(itemArray22);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        fPHeapMin39.imprime();
        fPHeapMin39.imprime();
        fPHeapMin39.imprime();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin46.refaz((int) (byte) 1, 0);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin46.copia(itemArray51);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin46.copia(itemArray53);
        fPHeapMin46.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin46.constroi();
        fPHeapMin46.constroi();
        fPHeapMin46.imprime();
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) 'a');
        ds.Item item65 = fPHeapMin64.min();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin67.refaz((int) (byte) 1, 0);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMin67.copia(itemArray72);
        ds.Item[] itemArray74 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray74);
        fPHeapMin67.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray74);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        fPHeapMin78.copia(itemArray79);
        fPHeapMin64.copia(itemArray79);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray79);
        ds.Item[] itemArray84 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray84);
        fPHeapMin83.copia(itemArray84);
        fPHeapMin46.copia(itemArray84);
        fPHeapMin44.copia(itemArray84);
        fPHeapMin39.copia(itemArray84);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) 'a');
        ds.Item item20 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin22.refaz((int) (byte) 1, 0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin22.copia(itemArray27);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin22.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin33.copia(itemArray34);
        fPHeapMin19.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        ds.Item item45 = fPHeapMin1.min();
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) 'a');
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin11.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin5.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item29 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin31.imprime();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) 'a');
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        fPHeapMin31.copia(itemArray36);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin21.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        fPHeapMin39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin19.refaz((int) (byte) 1, 0);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin19.copia(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin19.copia(itemArray26);
        fPHeapMin17.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) 'a');
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin11.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin5.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) 'a');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin36.refaz((int) (byte) 1, 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray16);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin23.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray11);
        java.lang.Class<?> wildcardClass20 = fPHeapMin19.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) 'a');
        fPHeapMin18.imprime();
        fPHeapMin18.constroi();
        fPHeapMin18.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin18.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass28 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) 'a');
        ds.Item item20 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin22.refaz((int) (byte) 1, 0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin22.copia(itemArray27);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin22.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin33.copia(itemArray34);
        fPHeapMin19.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item45 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item14 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin16.refaz((int) (byte) 1, 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin16.copia(itemArray21);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin16.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin13.copia(itemArray23);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray23);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin31.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        fPHeapMin5.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin3.refaz((int) (byte) 1, 0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin3.copia(itemArray8);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin3.copia(itemArray10);
        fPHeapMin3.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin3.constroi();
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) 'a');
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin24.refaz((int) (byte) 1, 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin24.copia(itemArray29);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin24.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin35.copia(itemArray36);
        fPHeapMin21.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin40.copia(itemArray41);
        fPHeapMin3.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) 'a');
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin55.refaz((int) (byte) 1, 0);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMin55.copia(itemArray60);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray60);
        fPHeapMin50.copia(itemArray60);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin((int) 'a');
        ds.Item item66 = fPHeapMin65.min();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin68.refaz((int) (byte) 1, 0);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMin68.copia(itemArray73);
        ds.Item[] itemArray75 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray75);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray75);
        fPHeapMin68.copia(itemArray75);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray75);
        ds.Item[] itemArray80 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray80);
        fPHeapMin79.copia(itemArray80);
        fPHeapMin65.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray80);
        fPHeapMin50.copia(itemArray80);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) itemArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin4.refaz((int) (byte) 1, 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin4.copia(itemArray9);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin4.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.diminuiChave(0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) 'a');
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin11.refaz((int) (byte) 1, 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin11.copia(itemArray16);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin11.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin5.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item29 = fPHeapMin1.min();
        ds.Item item30 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) 'a');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item16 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) 'a');
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin25.refaz((int) (byte) 1, 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin25.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin20.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) 'a');
        ds.Item item36 = fPHeapMin35.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin38.refaz((int) (byte) 1, 0);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin38.copia(itemArray43);
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        fPHeapMin38.copia(itemArray45);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin49.copia(itemArray50);
        fPHeapMin35.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray50);
        fPHeapMin20.copia(itemArray50);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin58.refaz((int) (byte) 1, 0);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMin58.copia(itemArray63);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray63);
        fPHeapMin20.copia(itemArray63);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray63);
        fPHeapMin1.copia(itemArray63);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.refaz((int) (byte) 1, 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin1.copia(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin12.copia(itemArray13);
        fPHeapMin12.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item24 = fPHeapMin23.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin26.refaz((int) (byte) 1, 0);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin26.copia(itemArray31);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        fPHeapMin26.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin23.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray33);
        fPHeapMin12.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray33);
    }
}

