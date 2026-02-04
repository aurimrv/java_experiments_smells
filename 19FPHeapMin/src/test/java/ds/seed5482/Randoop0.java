package ds.seed5482;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin6.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        java.lang.Class<?> wildcardClass8 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        java.lang.Class<?> wildcardClass13 = itemArray9.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin4.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.constroi();
        ds.Item item21 = fPHeapMin19.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass9 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.constroi();
        fPHeapMin9.imprime();
        ds.Item item15 = fPHeapMin9.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) item15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = fPHeapMin5.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin13.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave(0, (java.lang.Object) itemArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        java.lang.Class<?> wildcardClass18 = itemArray13.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        java.lang.Class<?> wildcardClass11 = itemArray6.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass6 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        java.lang.Class<?> wildcardClass8 = fPHeapMin7.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.Item item10 = fPHeapMin4.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        ds.Item item15 = fPHeapMin6.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.constroi();
        fPHeapMin9.constroi();
        fPHeapMin9.imprime();
        fPHeapMin9.constroi();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin9.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
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
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.refaz((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin5.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin10.copia(itemArray21);
        java.lang.Class<?> wildcardClass26 = fPHeapMin10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        java.lang.Class<?> wildcardClass27 = itemArray21.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        fPHeapMin7.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin7.copia(itemArray16);
        fPHeapMin4.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(1);
        fPHeapMin6.imprime();
        ds.Item item8 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave((int) (byte) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        java.lang.Class<?> wildcardClass18 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave(0, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin19.diminuiChave(0, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMin16.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin7.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin13.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin12.copia(itemArray21);
        fPHeapMin9.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin19.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item16 = fPHeapMin15.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin13.constroi();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) '#');
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        fPHeapMin20.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) '#');
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        fPHeapMin18.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.diminuiChave(10, (java.lang.Object) fPHeapMin18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        java.lang.Class<?> wildcardClass5 = fPHeapMin4.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMin16.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(1);
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        java.lang.Class<?> wildcardClass11 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        java.lang.Class<?> wildcardClass20 = itemArray15.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.refaz((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin25.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        fPHeapMin22.copia(itemArray33);
        fPHeapMin6.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin15.constroi();
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave(10, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item45 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item8 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        java.lang.Class<?> wildcardClass19 = fPHeapMin18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        fPHeapMin1.constroi();
        ds.Item item11 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.refaz((int) '#', (int) (short) 1);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(10);
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin32.copia(itemArray43);
        fPHeapMin16.copia(itemArray43);
        fPHeapMin11.copia(itemArray43);
        fPHeapMin1.copia(itemArray43);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin25.constroi();
        fPHeapMin25.constroi();
        fPHeapMin25.imprime();
        fPHeapMin25.constroi();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) '#');
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin25.copia(itemArray36);
        fPHeapMin12.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin13.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMin36.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.constroi();
        ds.Item item9 = fPHeapMin7.min();
        fPHeapMin7.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMin7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin15.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        java.lang.Class<?> wildcardClass28 = fPHeapMin12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item9 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.refaz((int) '#', (int) (short) 1);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) '#');
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray52);
        fPHeapMin46.copia(itemArray52);
        fPHeapMin46.imprime();
        fPHeapMin46.constroi();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) '#');
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMin59.copia(itemArray61);
        fPHeapMin59.constroi();
        fPHeapMin59.constroi();
        fPHeapMin59.imprime();
        fPHeapMin59.constroi();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) '#');
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMin68.copia(itemArray70);
        fPHeapMin59.copia(itemArray70);
        fPHeapMin46.copia(itemArray70);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin((int) '#');
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMin75.copia(itemArray77);
        fPHeapMin75.constroi();
        fPHeapMin75.constroi();
        fPHeapMin75.imprime();
        fPHeapMin75.constroi();
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin((int) '#');
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        fPHeapMin84.copia(itemArray86);
        fPHeapMin75.copia(itemArray86);
        fPHeapMin46.copia(itemArray86);
        fPHeapMin1.copia(itemArray86);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) '#');
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        fPHeapMin20.imprime();
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        ds.Item item29 = fPHeapMin20.min();
        fPHeapMin20.refaz((int) ' ', (int) (short) -1);
        fPHeapMin20.imprime();
        fPHeapMin20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        java.lang.Class<?> wildcardClass47 = itemArray41.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        java.lang.Class<?> wildcardClass17 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin7.copia(itemArray17);
        fPHeapMin1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin13.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin19.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray42);
        fPHeapMin39.copia(itemArray42);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) '#');
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin46.copia(itemArray48);
        fPHeapMin39.copia(itemArray48);
        fPHeapMin36.copia(itemArray48);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray48);
        fPHeapMin19.copia(itemArray48);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray48);
        fPHeapMin1.copia(itemArray48);
        ds.Item item56 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item56);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) '#');
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin15.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.constroi();
        fPHeapMin16.constroi();
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin16.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin19.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass10 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) '#');
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin15.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) '#');
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin34.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) '#');
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        fPHeapMin34.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray42);
        fPHeapMin31.copia(itemArray42);
        fPHeapMin15.copia(itemArray42);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin14.copia(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) '#');
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin33.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin14.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) itemArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin7.copia(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray17);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        java.lang.Class<?> wildcardClass17 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin45.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin19.copia(itemArray22);
        fPHeapMin17.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.constroi();
        fPHeapMin16.constroi();
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin16.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin13.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        fPHeapMin13.copia(itemArray24);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item10 = fPHeapMin1.min();
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray19);
        fPHeapMin16.copia(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin16.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) '#');
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin34.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) '#');
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        fPHeapMin34.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray42);
        fPHeapMin31.copia(itemArray42);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(0);
        fPHeapMin48.imprime();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray54);
        fPHeapMin51.copia(itemArray54);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) '#');
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMin58.copia(itemArray60);
        fPHeapMin51.copia(itemArray60);
        fPHeapMin48.copia(itemArray60);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray60);
        fPHeapMin31.copia(itemArray60);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray60);
        fPHeapMin13.copia(itemArray60);
        fPHeapMin1.copia(itemArray60);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item item5 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass21 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin19.copia(itemArray22);
        fPHeapMin17.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.Item item28 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.refaz((int) 'a', (int) '#');
        fPHeapMin1.constroi();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) '#');
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin43.imprime();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) '#');
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin49.copia(itemArray51);
        fPHeapMin43.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item11 = fPHeapMin1.min();
        ds.Item[] itemArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        fPHeapMin19.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin37.refaz((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.refaz(10, 1);
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.refaz(10, 1);
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item[] itemArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        ds.Item item27 = fPHeapMin1.min();
        ds.Item item28 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) '#');
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin32.imprime();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) '#');
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        fPHeapMin30.copia(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray40);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin9.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin23.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) '#');
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin23.copia(itemArray31);
        fPHeapMin6.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin31.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.diminuiChave((int) (short) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin15.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin73.copia(itemArray74);
        fPHeapMin71.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin71.copia(itemArray80);
        fPHeapMin68.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        fPHeapMin51.copia(itemArray80);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray80);
        fPHeapMin48.copia(itemArray80);
        fPHeapMin1.copia(itemArray80);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(1);
        fPHeapMin11.imprime();
        ds.Item item13 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) '#');
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.constroi();
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) '#');
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin17.copia(itemArray28);
        fPHeapMin4.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass6 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        java.lang.Class<?> wildcardClass42 = itemArray33.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item17 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin20.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin8.constroi();
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(0);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        fPHeapMin15.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) '#');
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin29.imprime();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin29.copia(itemArray37);
        fPHeapMin12.copia(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) '#');
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin46.copia(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin42.copia(itemArray48);
        fPHeapMin12.copia(itemArray48);
        fPHeapMin8.copia(itemArray48);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin55.constroi();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        fPHeapMin58.constroi();
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) '#');
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMin61.copia(itemArray63);
        fPHeapMin61.imprime();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) '#');
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray69);
        fPHeapMin58.copia(itemArray69);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(0);
        fPHeapMin75.imprime();
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMin80.copia(itemArray81);
        fPHeapMin78.copia(itemArray81);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin((int) '#');
        ds.Item item86 = null;
        ds.Item[] itemArray87 = new ds.Item[] { item86 };
        fPHeapMin85.copia(itemArray87);
        fPHeapMin78.copia(itemArray87);
        fPHeapMin75.copia(itemArray87);
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray87);
        fPHeapMin58.copia(itemArray87);
        ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(itemArray87);
        fPHeapMin55.copia(itemArray87);
        fPHeapMin8.copia(itemArray87);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray87);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.constroi();
        fPHeapMin16.constroi();
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin16.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        java.lang.Class<?> wildcardClass18 = fPHeapMin17.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
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
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin19.copia(itemArray22);
        fPHeapMin17.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        java.lang.Class<?> wildcardClass28 = itemArray22.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMin37.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.Item item12 = fPHeapMin6.min();
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray23);
        fPHeapMin20.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin20.copia(itemArray29);
        fPHeapMin17.copia(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) '#');
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin34.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) '#');
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        fPHeapMin34.copia(itemArray42);
        fPHeapMin17.copia(itemArray42);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave((int) (short) 10, (java.lang.Object) itemArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) ' ');
        ds.Item item6 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin7.copia(itemArray17);
        fPHeapMin1.copia(itemArray17);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin33.copia(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray43);
        fPHeapMin1.copia(itemArray43);
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item10 = fPHeapMin1.min();
        ds.Item item11 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        ds.Item item15 = fPHeapMin1.min();
        ds.Item item16 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) '#');
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin23.copia(itemArray34);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin23.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray38);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMin20.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray2);
        fPHeapMin6.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) ' ');
        java.lang.Class<?> wildcardClass49 = fPHeapMin48.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin45.diminuiChave(0, (java.lang.Object) wildcardClass49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin12.constroi();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.constroi();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) '#');
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin42.copia(itemArray44);
        fPHeapMin42.imprime();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) '#');
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin42.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin39.copia(itemArray50);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray62);
        fPHeapMin59.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) '#');
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMin66.copia(itemArray68);
        fPHeapMin59.copia(itemArray68);
        fPHeapMin56.copia(itemArray68);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray68);
        fPHeapMin39.copia(itemArray68);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin35.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) (byte) 1, (-1));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin37.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        java.lang.Class<?> wildcardClass36 = itemArray29.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave((int) '4', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin73.copia(itemArray74);
        fPHeapMin71.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin71.copia(itemArray80);
        fPHeapMin68.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        fPHeapMin51.copia(itemArray80);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray80);
        fPHeapMin48.copia(itemArray80);
        fPHeapMin1.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item89 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) '#');
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin48.imprime();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin48.copia(itemArray56);
        fPHeapMin1.copia(itemArray56);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.constroi();
        fPHeapMin15.constroi();
        fPHeapMin15.refaz(0, (int) (byte) -1);
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(10);
        fPHeapMin26.constroi();
        fPHeapMin26.imprime();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) '#');
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin33.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin31.copia(itemArray41);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.constroi();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) '#');
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) '#');
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin50.copia(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        fPHeapMin47.copia(itemArray58);
        fPHeapMin31.copia(itemArray58);
        fPHeapMin26.copia(itemArray58);
        fPHeapMin15.copia(itemArray58);
        fPHeapMin1.copia(itemArray58);
        ds.Item item67 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item67);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        fPHeapMin9.copia(itemArray12);
        fPHeapMin9.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        fPHeapMin9.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin31.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        fPHeapMin45.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.constroi();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        java.lang.Class<?> wildcardClass9 = fPHeapMin8.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass10 = itemArray5.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin14.copia(itemArray17);
        fPHeapMin12.copia(itemArray17);
        fPHeapMin1.copia(itemArray17);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) '#');
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin43.constroi();
        fPHeapMin43.constroi();
        fPHeapMin43.refaz(0, (int) (byte) -1);
        fPHeapMin43.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(10);
        fPHeapMin54.constroi();
        fPHeapMin54.imprime();
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) '#');
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMin61.copia(itemArray63);
        fPHeapMin61.imprime();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) '#');
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray69);
        fPHeapMin59.copia(itemArray69);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(100);
        fPHeapMin75.constroi();
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin78.imprime();
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin((int) '#');
        ds.Item item85 = null;
        ds.Item[] itemArray86 = new ds.Item[] { item85 };
        fPHeapMin84.copia(itemArray86);
        fPHeapMin78.copia(itemArray86);
        ds.FPHeapMin fPHeapMin89 = new ds.FPHeapMin(itemArray86);
        fPHeapMin75.copia(itemArray86);
        fPHeapMin59.copia(itemArray86);
        fPHeapMin54.copia(itemArray86);
        fPHeapMin43.copia(itemArray86);
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray86);
        fPHeapMin1.copia(itemArray86);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(0, (int) (short) -1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.refaz(10, 0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        fPHeapMin13.imprime();
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        ds.Item item22 = fPHeapMin13.min();
        fPHeapMin13.refaz((int) ' ', (int) (short) -1);
        fPHeapMin13.imprime();
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        fPHeapMin29.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin13.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item42 = fPHeapMin41.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin12.copia(itemArray21);
        fPHeapMin9.copia(itemArray21);
        fPHeapMin7.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin19.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray42);
        fPHeapMin39.copia(itemArray42);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) '#');
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin46.copia(itemArray48);
        fPHeapMin39.copia(itemArray48);
        fPHeapMin36.copia(itemArray48);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray48);
        fPHeapMin19.copia(itemArray48);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray48);
        fPHeapMin1.copia(itemArray48);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        java.lang.Class<?> wildcardClass61 = itemArray57.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin16.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin13.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        fPHeapMin41.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) '#');
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) '#');
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        fPHeapMin44.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        fPHeapMin41.copia(itemArray52);
        fPHeapMin41.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin38.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(10);
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin32.copia(itemArray43);
        fPHeapMin16.copia(itemArray43);
        fPHeapMin11.copia(itemArray43);
        fPHeapMin1.copia(itemArray43);
        java.lang.Class<?> wildcardClass51 = itemArray43.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) '#');
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        fPHeapMin11.copia(itemArray22);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin31.constroi();
        fPHeapMin31.imprime();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        fPHeapMin31.copia(itemArray36);
        fPHeapMin11.copia(itemArray36);
        fPHeapMin1.copia(itemArray36);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        ds.Item item14 = fPHeapMin1.min();
        ds.Item item15 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.constroi();
        fPHeapMin18.constroi();
        fPHeapMin18.imprime();
        fPHeapMin18.constroi();
        fPHeapMin18.constroi();
        ds.Item item27 = fPHeapMin18.min();
        fPHeapMin18.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) '#');
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin32.constroi();
        fPHeapMin32.constroi();
        fPHeapMin32.refaz(0, (int) (byte) -1);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(10);
        fPHeapMin43.constroi();
        fPHeapMin43.imprime();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) '#');
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) '#');
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin50.copia(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        fPHeapMin48.copia(itemArray58);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.constroi();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) '#');
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMin67.copia(itemArray69);
        fPHeapMin67.imprime();
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) '#');
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMin73.copia(itemArray75);
        fPHeapMin67.copia(itemArray75);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray75);
        fPHeapMin64.copia(itemArray75);
        fPHeapMin48.copia(itemArray75);
        fPHeapMin43.copia(itemArray75);
        fPHeapMin32.copia(itemArray75);
        fPHeapMin18.copia(itemArray75);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        fPHeapMin35.imprime();
        java.lang.Class<?> wildcardClass37 = fPHeapMin35.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin10.copia(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) '#');
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin29.imprime();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin29.copia(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        fPHeapMin26.copia(itemArray37);
        fPHeapMin10.copia(itemArray37);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray37);
        fPHeapMin1.copia(itemArray37);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin19.copia(itemArray22);
        fPHeapMin17.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        java.lang.Class<?> wildcardClass28 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        fPHeapMin1.imprime();
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin3.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.imprime();
        fPHeapMin37.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin19.copia(itemArray22);
        fPHeapMin17.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin19.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin41.imprime();
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin((int) '#');
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMin47.copia(itemArray49);
        fPHeapMin41.copia(itemArray49);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray49);
        fPHeapMin38.copia(itemArray49);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(0);
        fPHeapMin55.imprime();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMin60.copia(itemArray61);
        fPHeapMin58.copia(itemArray61);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin((int) '#');
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMin65.copia(itemArray67);
        fPHeapMin58.copia(itemArray67);
        fPHeapMin55.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin38.copia(itemArray67);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray67);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin35.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) '#');
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.constroi();
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) '#');
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin17.copia(itemArray28);
        fPHeapMin4.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray37);
        fPHeapMin34.copia(itemArray37);
        fPHeapMin34.constroi();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray45);
        fPHeapMin42.copia(itemArray45);
        fPHeapMin34.copia(itemArray45);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) '#');
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMin53.copia(itemArray55);
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) '#');
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMin59.copia(itemArray61);
        fPHeapMin53.copia(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray61);
        fPHeapMin51.copia(itemArray61);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray61);
        fPHeapMin49.copia(itemArray61);
        fPHeapMin1.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item70 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray17);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        java.lang.Class<?> wildcardClass34 = itemArray28.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        fPHeapMin46.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin19.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray42);
        fPHeapMin39.copia(itemArray42);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) '#');
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin46.copia(itemArray48);
        fPHeapMin39.copia(itemArray48);
        fPHeapMin36.copia(itemArray48);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray48);
        fPHeapMin19.copia(itemArray48);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray48);
        fPHeapMin1.copia(itemArray48);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray57);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin61.diminuiChave((int) (byte) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(10);
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin32.copia(itemArray43);
        fPHeapMin16.copia(itemArray43);
        fPHeapMin11.copia(itemArray43);
        fPHeapMin1.copia(itemArray43);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(10);
        fPHeapMin52.constroi();
        fPHeapMin52.imprime();
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray56);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) '#');
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMin59.copia(itemArray61);
        fPHeapMin59.imprime();
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin((int) '#');
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMin65.copia(itemArray67);
        fPHeapMin59.copia(itemArray67);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray67);
        fPHeapMin57.copia(itemArray67);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(100);
        fPHeapMin73.constroi();
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin((int) '#');
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMin76.copia(itemArray78);
        fPHeapMin76.imprime();
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin((int) '#');
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMin82.copia(itemArray84);
        fPHeapMin76.copia(itemArray84);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray84);
        fPHeapMin73.copia(itemArray84);
        fPHeapMin57.copia(itemArray84);
        fPHeapMin52.copia(itemArray84);
        fPHeapMin1.copia(itemArray84);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item10 = fPHeapMin1.min();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin73.copia(itemArray74);
        fPHeapMin71.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin71.copia(itemArray80);
        fPHeapMin68.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        fPHeapMin51.copia(itemArray80);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray80);
        fPHeapMin48.copia(itemArray80);
        fPHeapMin1.copia(itemArray80);
        fPHeapMin1.constroi();
        ds.Item item90 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin33.copia(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray43);
        fPHeapMin1.copia(itemArray43);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin37.refaz((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item10 = fPHeapMin1.min();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item13 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) '#');
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        fPHeapMin20.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) '#');
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        fPHeapMin18.copia(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.constroi();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) '#');
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) '#');
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        fPHeapMin34.copia(itemArray45);
        fPHeapMin18.copia(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray45);
        fPHeapMin51.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin14.diminuiChave(10, (java.lang.Object) fPHeapMin51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin14.copia(itemArray17);
        fPHeapMin12.copia(itemArray17);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.constroi();
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) itemArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.constroi();
        fPHeapMin9.constroi();
        fPHeapMin9.imprime();
        fPHeapMin9.constroi();
        fPHeapMin9.constroi();
        ds.Item item18 = fPHeapMin9.min();
        fPHeapMin9.refaz((int) ' ', (int) (short) -1);
        fPHeapMin9.constroi();
        fPHeapMin9.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        fPHeapMin7.refaz(0, (int) (byte) -1);
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(10);
        fPHeapMin18.constroi();
        fPHeapMin18.imprime();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) '#');
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin25.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        fPHeapMin23.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.constroi();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) '#');
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin42.copia(itemArray44);
        fPHeapMin42.imprime();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) '#');
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin42.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin39.copia(itemArray50);
        fPHeapMin23.copia(itemArray50);
        fPHeapMin18.copia(itemArray50);
        fPHeapMin7.copia(itemArray50);
        fPHeapMin1.copia(itemArray50);
        ds.Item item59 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item59);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin73.copia(itemArray74);
        fPHeapMin71.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin71.copia(itemArray80);
        fPHeapMin68.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        fPHeapMin51.copia(itemArray80);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray80);
        fPHeapMin48.copia(itemArray80);
        fPHeapMin1.copia(itemArray80);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item90 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin38.refaz((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        fPHeapMin8.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) '#');
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin5.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin73.copia(itemArray74);
        fPHeapMin71.copia(itemArray74);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin((int) '#');
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMin78.copia(itemArray80);
        fPHeapMin71.copia(itemArray80);
        fPHeapMin68.copia(itemArray80);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray80);
        fPHeapMin51.copia(itemArray80);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray80);
        fPHeapMin48.copia(itemArray80);
        fPHeapMin1.copia(itemArray80);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass90 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        ds.Item item15 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.imprime();
        fPHeapMin13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin4.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item12 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(0);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '#');
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin18.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin27.copia(itemArray30);
        fPHeapMin27.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray37);
        fPHeapMin27.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) itemArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) '#');
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        fPHeapMin4.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) '#');
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin31.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin33.copia(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray43);
        fPHeapMin1.copia(itemArray43);
        java.lang.Class<?> wildcardClass50 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin14.copia(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) '#');
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin32.imprime();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) '#');
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        fPHeapMin29.copia(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(0);
        fPHeapMin46.imprime();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray52);
        fPHeapMin49.copia(itemArray52);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) '#');
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin49.copia(itemArray58);
        fPHeapMin46.copia(itemArray58);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray58);
        fPHeapMin29.copia(itemArray58);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray58);
        fPHeapMin11.copia(itemArray58);
        fPHeapMin1.copia(itemArray58);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray58);
        ds.Item item68 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin67.insere(item68);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) '#');
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin18.imprime();
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin31.constroi();
        fPHeapMin31.constroi();
        fPHeapMin31.imprime();
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) '#');
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        fPHeapMin31.copia(itemArray42);
        fPHeapMin18.copia(itemArray42);
        fPHeapMin16.copia(itemArray42);
        fPHeapMin14.copia(itemArray42);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.constroi();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) '#');
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMin53.copia(itemArray55);
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) '#');
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMin59.copia(itemArray61);
        fPHeapMin53.copia(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray61);
        fPHeapMin50.copia(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(0);
        fPHeapMin67.imprime();
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray73 = new ds.Item[] {};
        fPHeapMin72.copia(itemArray73);
        fPHeapMin70.copia(itemArray73);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) '#');
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMin77.copia(itemArray79);
        fPHeapMin70.copia(itemArray79);
        fPHeapMin67.copia(itemArray79);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray79);
        fPHeapMin50.copia(itemArray79);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin14.diminuiChave(10, (java.lang.Object) itemArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item25 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin22.imprime();
        java.lang.Class<?> wildcardClass24 = fPHeapMin22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin9.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        java.lang.Class<?> wildcardClass22 = itemArray18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) '#');
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) '#');
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin42.copia(itemArray44);
        fPHeapMin36.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin33.copia(itemArray44);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(0);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMin55.copia(itemArray56);
        fPHeapMin53.copia(itemArray56);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin53.copia(itemArray62);
        fPHeapMin50.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        fPHeapMin33.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray62);
        fPHeapMin30.copia(itemArray62);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray62);
        fPHeapMin1.copia(itemArray62);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
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
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin14.copia(itemArray17);
        fPHeapMin12.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin22.diminuiChave(10, (java.lang.Object) itemArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray12);
        fPHeapMin9.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) ' ', (int) (short) -1);
        ds.Item item14 = fPHeapMin1.min();
        ds.Item item15 = fPHeapMin1.min();
        ds.Item item16 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.refaz(10, 0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        ds.Item item17 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        fPHeapMin19.refaz(0, (int) (byte) -1);
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(10);
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) '#');
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) '#');
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        fPHeapMin35.copia(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.constroi();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) '#');
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin54.copia(itemArray56);
        fPHeapMin54.imprime();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) '#');
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin51.copia(itemArray62);
        fPHeapMin35.copia(itemArray62);
        fPHeapMin30.copia(itemArray62);
        fPHeapMin19.copia(itemArray62);
        fPHeapMin13.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) itemArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '#');
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) '#');
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin2.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray43);
        fPHeapMin40.copia(itemArray43);
        fPHeapMin40.constroi();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray51);
        fPHeapMin48.copia(itemArray51);
        fPHeapMin40.copia(itemArray51);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin35.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '#');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin4.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) '#');
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin21.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin4.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray33);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        ds.Item item27 = fPHeapMin1.min();
        ds.Item item28 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '#');
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) '#');
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) '#');
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin14.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) '#');
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) '#');
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin30.copia(itemArray41);
        fPHeapMin1.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin46.refaz(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
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
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) '#');
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin10.copia(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) '#');
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin29.imprime();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin29.copia(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        fPHeapMin26.copia(itemArray37);
        fPHeapMin10.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) itemArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        fPHeapMin1.constroi();
        ds.Item item28 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(10);
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) '#');
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) '#');
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin32.copia(itemArray43);
        fPHeapMin16.copia(itemArray43);
        fPHeapMin11.copia(itemArray43);
        fPHeapMin1.copia(itemArray43);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) '#');
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin10.copia(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin8.copia(itemArray18);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) '#');
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin27.imprime();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) '#');
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray35);
        fPHeapMin24.copia(itemArray35);
        fPHeapMin8.copia(itemArray35);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray35);
        fPHeapMin41.imprime();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(1);
        fPHeapMin44.imprime();
        ds.Item item46 = fPHeapMin44.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) '#');
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        fPHeapMin41.copia(itemArray50);
        fPHeapMin1.copia(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray50);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) '#');
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) '#');
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        fPHeapMin11.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        ds.Item item27 = fPHeapMin1.min();
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '#');
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) '#');
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) '#');
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin16.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        java.lang.Class<?> wildcardClass34 = itemArray26.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        org.junit.Assert.assertNotNull(itemArray6);
    }
}

