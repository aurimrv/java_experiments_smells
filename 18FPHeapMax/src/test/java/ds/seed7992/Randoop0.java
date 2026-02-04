package ds.seed7992;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass13 = itemArray9.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Object obj33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax5.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item[] itemArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax34.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax34.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        ds.Item item10 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        ds.Item item21 = fPHeapMax5.max();
        ds.Item item22 = fPHeapMax5.max();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        ds.Item item14 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax9.copia(itemArray21);
        ds.Item item25 = fPHeapMax9.max();
        ds.Item item26 = fPHeapMax9.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.Item item53 = fPHeapMax49.max();
        ds.Item item54 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax49.copia(itemArray61);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax49.copia(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item[] itemArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        java.lang.Class<?> wildcardClass26 = itemArray21.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item57 = fPHeapMax56.max();
        fPHeapMax56.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax49.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax12.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax12.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax30.copia(itemArray36);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax30.copia(itemArray43);
        fPHeapMax12.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = item2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax20.copia(itemArray32);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax18.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax32.copia(itemArray39);
        ds.Item item43 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.Item item45 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass37 = itemArray32.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        java.lang.Object obj49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        fPHeapMax32.copia(itemArray47);
        fPHeapMax6.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        java.lang.Class<?> wildcardClass15 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = item5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax3.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax13.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass36 = itemArray32.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        ds.Item item19 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax14.copia(itemArray26);
        ds.Item item30 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax32.copia(itemArray38);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax32.copia(itemArray45);
        fPHeapMax14.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.Item item20 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        ds.Item item31 = fPHeapMax15.max();
        ds.Item item32 = fPHeapMax15.max();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax15.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        java.lang.Class<?> wildcardClass41 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.refaz((int) (byte) 1, (int) (byte) 0);
        ds.Item item20 = fPHeapMax15.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass26 = itemArray22.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item27 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.Item item26 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax21.copia(itemArray33);
        ds.Item item37 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray54);
        fPHeapMax21.copia(itemArray54);
        fPHeapMax16.copia(itemArray54);
        fPHeapMax5.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) itemArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax3.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        ds.Item item10 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        ds.Item item21 = fPHeapMax5.max();
        ds.Item item22 = fPHeapMax5.max();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax18.copia(itemArray30);
        ds.Item item34 = fPHeapMax18.max();
        ds.Item item35 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item53 = fPHeapMax52.max();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax56.copia(itemArray60);
        fPHeapMax52.copia(itemArray60);
        fPHeapMax45.copia(itemArray60);
        fPHeapMax37.copia(itemArray60);
        fPHeapMax18.copia(itemArray60);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        ds.Item item45 = fPHeapMax41.max();
        ds.Item item46 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item16 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item47 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax30.copia(itemArray45);
        fPHeapMax4.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        java.lang.Class<?> wildcardClass52 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax27.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax27.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item10 = fPHeapMax9.max();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax4.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.Item item33 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        fPHeapMax12.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        java.lang.Class<?> wildcardClass55 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax13.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax26.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        ds.Item item27 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.Item item35 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        ds.Item item46 = fPHeapMax30.max();
        ds.Item item47 = fPHeapMax30.max();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray48);
        fPHeapMax16.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        ds.Item item52 = fPHeapMax1.max();
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item16 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item[] itemArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item[] itemArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        ds.Item item50 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item50);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.Item item32 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax27.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax27.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        fPHeapMax5.copia(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        ds.Item item12 = fPHeapMax8.max();
        ds.Item item13 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        ds.Item item24 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray41);
        fPHeapMax8.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax20.copia(itemArray30);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray35);
        fPHeapMax15.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        ds.Item item11 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax6.copia(itemArray18);
        ds.Item item22 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax24.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray39);
        fPHeapMax6.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        java.lang.Class<?> wildcardClass43 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.Item item33 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        fPHeapMax12.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item55 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item[] itemArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.Item item33 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        fPHeapMax12.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item55 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass23 = itemArray16.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = item2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item14 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.refaz(0, (int) (byte) -1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass32 = itemArray26.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax17.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax17.copia(itemArray30);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax20.copia(itemArray32);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax18.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax4.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        ds.Item item54 = fPHeapMax50.max();
        ds.Item item55 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax58.copia(itemArray62);
        fPHeapMax50.copia(itemArray62);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax50.copia(itemArray69);
        fPHeapMax48.copia(itemArray69);
        fPHeapMax4.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item75 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        ds.Item item33 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item48 = fPHeapMax47.max();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax51.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        fPHeapMax39.copia(itemArray55);
        fPHeapMax28.copia(itemArray55);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax13.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax49.copia(itemArray57);
        fPHeapMax41.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        ds.Item item30 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax29.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item66 = fPHeapMax65.max();
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax69.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax58.copia(itemArray73);
        fPHeapMax50.copia(itemArray73);
        fPHeapMax1.copia(itemArray73);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.Item item33 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        fPHeapMax12.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax39.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax48.copia(itemArray52);
        fPHeapMax39.copia(itemArray52);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax57.copia(itemArray63);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax66.copia(itemArray70);
        fPHeapMax57.copia(itemArray70);
        fPHeapMax39.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax4.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax11.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax11.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax4.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass25 = itemArray19.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.Item item26 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax21.copia(itemArray33);
        ds.Item item37 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray54);
        fPHeapMax21.copia(itemArray54);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item60 = fPHeapMax59.max();
        fPHeapMax59.imprime();
        fPHeapMax59.constroi();
        fPHeapMax59.refaz((int) (byte) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax67.constroi();
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax67.copia(itemArray73);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax78.copia(itemArray80);
        fPHeapMax76.copia(itemArray80);
        fPHeapMax67.copia(itemArray80);
        fPHeapMax59.copia(itemArray80);
        fPHeapMax21.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax13.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax38.copia(itemArray44);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax38.copia(itemArray51);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax56.copia(itemArray62);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax65.copia(itemArray69);
        fPHeapMax56.copia(itemArray69);
        fPHeapMax38.copia(itemArray69);
        fPHeapMax38.imprime();
        fPHeapMax38.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        java.lang.Class<?> wildcardClass29 = fPHeapMax25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax20.copia(itemArray32);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax18.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax4.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        ds.Item item54 = fPHeapMax50.max();
        ds.Item item55 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax58.copia(itemArray62);
        fPHeapMax50.copia(itemArray62);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax50.copia(itemArray69);
        fPHeapMax48.copia(itemArray69);
        fPHeapMax4.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax20.copia(itemArray32);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax6.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax15.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax24.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray39);
        fPHeapMax24.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        fPHeapMax39.refaz((int) (byte) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax47.constroi();
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax47.copia(itemArray53);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax56.copia(itemArray60);
        fPHeapMax47.copia(itemArray60);
        fPHeapMax39.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        ds.Item item66 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item66);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        java.lang.Class<?> wildcardClass33 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        ds.Item item16 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        ds.Item item27 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray44);
        fPHeapMax11.copia(itemArray44);
        fPHeapMax9.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (byte) -1);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax34.copia(itemArray41);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        ds.Item item50 = fPHeapMax46.max();
        ds.Item item51 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax46.copia(itemArray65);
        fPHeapMax34.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        java.lang.Class<?> wildcardClass36 = itemArray31.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax15.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.Item item52 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax55.copia(itemArray59);
        fPHeapMax47.copia(itemArray59);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax47.copia(itemArray66);
        fPHeapMax45.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        ds.Item item71 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        ds.Item item26 = fPHeapMax22.max();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax22.copia(itemArray41);
        fPHeapMax20.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax14.copia(itemArray30);
        fPHeapMax11.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        fPHeapMax32.copia(itemArray47);
        fPHeapMax6.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.refaz(1, (-1));
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item item34 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        ds.Item item30 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        ds.Item item37 = fPHeapMax33.max();
        ds.Item item38 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax33.copia(itemArray45);
        ds.Item item49 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.constroi();
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax51.copia(itemArray57);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax51.copia(itemArray64);
        fPHeapMax33.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        ds.Item item13 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax26.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax35.copia(itemArray51);
        fPHeapMax26.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray25);
        fPHeapMax5.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.Item item20 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        ds.Item item31 = fPHeapMax15.max();
        ds.Item item32 = fPHeapMax15.max();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 0);
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        ds.Item item26 = fPHeapMax22.max();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax22.copia(itemArray41);
        fPHeapMax20.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item54 = fPHeapMax53.max();
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        fPHeapMax46.copia(itemArray61);
        fPHeapMax38.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        java.lang.Class<?> wildcardClass68 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax29.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax3.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax3.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax3.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax13.copia(itemArray29);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item37 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax36.copia(itemArray43);
        fPHeapMax13.copia(itemArray43);
        fPHeapMax8.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        ds.Item item29 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax24.copia(itemArray36);
        ds.Item item40 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax48.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax42.copia(itemArray52);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray57);
        fPHeapMax24.copia(itemArray57);
        fPHeapMax24.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.Item item32 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax27.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax27.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        fPHeapMax5.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item57 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item64 = fPHeapMax63.max();
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax67.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        fPHeapMax61.copia(itemArray71);
        fPHeapMax59.copia(itemArray71);
        fPHeapMax56.copia(itemArray71);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item35 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax34.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.Item item20 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        ds.Item item31 = fPHeapMax15.max();
        ds.Item item32 = fPHeapMax15.max();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax8.copia(itemArray14);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax18.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.Item item35 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax30.copia(itemArray49);
        fPHeapMax18.copia(itemArray49);
        fPHeapMax8.copia(itemArray49);
        fPHeapMax4.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax3.copia(itemArray19);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax3.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.imprime();
        ds.Item item40 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (byte) -1);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax7.copia(itemArray13);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax7.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax7.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item39 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax42.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item52 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax51.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.Item item32 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax27.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax27.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        fPHeapMax5.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray52);
        ds.Item item54 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item54);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.imprime();
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax4.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax21.copia(itemArray33);
        fPHeapMax19.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        ds.Item item50 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(1);
        fPHeapMax53.constroi();
        ds.Item item55 = fPHeapMax53.max();
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax58.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item67 = fPHeapMax66.max();
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax58.copia(itemArray74);
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item82 = fPHeapMax81.max();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax84.copia(itemArray88);
        fPHeapMax81.copia(itemArray88);
        fPHeapMax58.copia(itemArray88);
        fPHeapMax53.copia(itemArray88);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) itemArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNull(item82);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.Item item17 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax10.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax24.copia(itemArray40);
        fPHeapMax21.copia(itemArray40);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item55 = fPHeapMax54.max();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax58.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        fPHeapMax47.copia(itemArray62);
        fPHeapMax21.copia(itemArray62);
        fPHeapMax18.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        ds.Item item27 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.Item item35 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        ds.Item item46 = fPHeapMax30.max();
        ds.Item item47 = fPHeapMax30.max();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray48);
        fPHeapMax16.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax57.copia(itemArray63);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax57.copia(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) itemArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        fPHeapMax49.copia(itemArray56);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        ds.Item item65 = fPHeapMax61.max();
        ds.Item item66 = fPHeapMax61.max();
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax69.copia(itemArray73);
        fPHeapMax61.copia(itemArray73);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax78.copia(itemArray80);
        fPHeapMax61.copia(itemArray80);
        fPHeapMax49.copia(itemArray80);
        fPHeapMax1.copia(itemArray80);
        java.lang.Class<?> wildcardClass85 = itemArray80.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) -1);
        fPHeapMax1.constroi();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax30.copia(itemArray37);
        fPHeapMax7.copia(itemArray37);
        fPHeapMax5.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        ds.Item item27 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.Item item35 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        ds.Item item46 = fPHeapMax30.max();
        ds.Item item47 = fPHeapMax30.max();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray48);
        fPHeapMax16.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.Item item22 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        ds.Item item33 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item38 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray50);
        fPHeapMax17.copia(itemArray50);
        fPHeapMax12.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass56 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        java.lang.Class<?> wildcardClass16 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.Item item20 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        ds.Item item31 = fPHeapMax15.max();
        ds.Item item32 = fPHeapMax15.max();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.imprime();
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax6.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax6.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.constroi();
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax37.copia(itemArray43);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax37.copia(itemArray50);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax37.copia(itemArray57);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax37.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax19.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax50.copia(itemArray54);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item59 = fPHeapMax58.max();
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax62.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        fPHeapMax50.copia(itemArray66);
        fPHeapMax47.copia(itemArray66);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item81 = fPHeapMax80.max();
        fPHeapMax80.imprime();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax84.copia(itemArray88);
        fPHeapMax80.copia(itemArray88);
        fPHeapMax73.copia(itemArray88);
        fPHeapMax47.copia(itemArray88);
        fPHeapMax42.copia(itemArray88);
        fPHeapMax10.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNull(item81);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax19.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        ds.Item item27 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.Item item35 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        ds.Item item46 = fPHeapMax30.max();
        ds.Item item47 = fPHeapMax30.max();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray48);
        fPHeapMax16.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        ds.Item item52 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item53 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax10.imprime();
        ds.Item item22 = fPHeapMax10.max();
        ds.Item item23 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax25.copia(itemArray32);
        ds.Item item36 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        ds.Item item43 = fPHeapMax39.max();
        ds.Item item44 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax39.copia(itemArray51);
        ds.Item item55 = fPHeapMax39.max();
        ds.Item item56 = fPHeapMax39.max();
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray57);
        fPHeapMax25.copia(itemArray57);
        fPHeapMax10.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        java.lang.Class<?> wildcardClass62 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax14.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax14.copia(itemArray27);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax14.copia(itemArray40);
        fPHeapMax8.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax9.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        java.lang.Class<?> wildcardClass33 = itemArray29.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        ds.Item item19 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray36);
        fPHeapMax3.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item55 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax54.copia(itemArray61);
        fPHeapMax41.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        java.lang.Class<?> wildcardClass34 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = fPHeapMax1.max();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.Item item28 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        fPHeapMax23.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item50 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        fPHeapMax49.copia(itemArray56);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        ds.Item item65 = fPHeapMax61.max();
        ds.Item item66 = fPHeapMax61.max();
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax69.copia(itemArray73);
        fPHeapMax61.copia(itemArray73);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax78.copia(itemArray80);
        fPHeapMax61.copia(itemArray80);
        fPHeapMax49.copia(itemArray80);
        fPHeapMax1.copia(itemArray80);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        ds.Item item30 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        ds.Item item41 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item46 = fPHeapMax45.max();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax49.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax43.copia(itemArray53);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray58);
        fPHeapMax25.copia(itemArray58);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax3.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax17.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax17.copia(itemArray30);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 0);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax35.constroi();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax35.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax44.copia(itemArray48);
        fPHeapMax35.copia(itemArray48);
        fPHeapMax17.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray48);
    }
}

